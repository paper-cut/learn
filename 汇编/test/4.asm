assume cs:codesg

codesg segment
    start:
    mov ax,0ffffh
    mov ds,ax
    mov bx,6
    mov ax,[bx]
    ; mov al,[bx]
    ; mov ah,0

    mov ax,4c00H
    int 21H
codesg ends
end start