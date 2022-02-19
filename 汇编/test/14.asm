; 10001/100
assume cs:codesg

codesg segment
    start:
    mov dx,1
    mov ax,86A1H

    mov bx,100
    div bx

    mov ax,4c00h
    int 21h

codesg ends
end start
