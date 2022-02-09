; 定义不同的段

assume cs:code,ds:data,ss:stack

data segment
dw 0123H,0456H,0789H,0abcH,0defH,0fedH,0cbaH,0987H
data ends

stack segment
dw 0,0,0,0,0,0,0,0
stack ends

code segment
    

    start:
    mov ax,cs
    mov ss,ax
    mov sp,32
    mov bx,0
    mov cx,8
    s:
    push cs:[bx]
    add bx,2
    loop s

    mov bx,0
    mov cx,8

    s0:
    pop cs:[bx]
    add bx,2
    loop s0

    mov ax,4c00h
    int 21h

code ends
end start


