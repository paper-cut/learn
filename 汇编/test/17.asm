assume cs:code,ds:data

data segment
    db 0
    jmp far ptr start
data ends
    
code segment
    start:
    mov ax,data
    mov ds,ax
    mov bx,0
    jmp word ptr ds:[bx+1]
code ends
end start