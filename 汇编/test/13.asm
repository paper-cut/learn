;将数据暂存进入栈中

; 把datasg中的每个单词都改为大写字母
assume cs:codesg,ds:datasg,ss:stacksg

datasg segment
    db 'ibm             '
    db 'aec             '
    db 'dos             '
    db 'vax             '
datasg ends

stacksg segment
    dw 0,0,0,0,0,0,0,0
stacksg ends

codesg segment
    start:
    mov ax,datasg
    mov ds,ax
    mov bx,0
    mov ax,stacksg
    mov ss,ax

    mov cx,4
    s:
    ; mov si,cx 可以使用dx寄存器来临时存放外层cx的值
    ; mov dx,cx 这里选择放入栈中
    push cx
    mov cx,3
     mov di,0
    p:
    mov al,[bx+di]
    and al,11011111b
    mov [bx+di],al
    inc di
    loop p
    add bx,16
    ; mov cx,si
    ; mov cx,dx
    pop cx
    loop s

    mov ax,4c00h
    int 21h

codesg ends
end start
