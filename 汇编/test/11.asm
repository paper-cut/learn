; 将datasg中的每一个单词的开头改为大写字母

assume cs:codesg,ds:datasg

datasg segment
    db '1.file          '
    db '2.eidt          '
    db '3.search        '
    db '4.view          '
    db '5.options       '
    db '6.help          '
datasg ends

codesg segment
    start:
    mov ax,datasg
    mov ds,ax
    mov bx,0
    mov si,16

    s:
    mov al,[bx+2]
    and al,11011111b
    mov [bx+2],al

    add bx,si
    loop s

    mov ax,4c00h
    int 21h


codesg ends
end start