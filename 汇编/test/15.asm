;1001/100

assume cs:codesg

codesg segment
    start:
    mov ax,1001
    mov bx,100

    div bx

    mov ax,4c00h
    int 21h

codesg ends
end start