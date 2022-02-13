assume cs:codesg,ds:data

data segment
    db 'iNfOrMatIon'
data ends

codesg segment
    start:
    mov ax,data
    mov ds,ax
    mov bx,0

    mov cx,11
    s:
    mov ax,[bx]
    or ax,00100000b
    mov [bx],ax
    inc bx
    loop s

    mov ax,4c00h
    int 21h
codesg ends
end start