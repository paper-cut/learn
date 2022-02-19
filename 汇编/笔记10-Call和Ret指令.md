# Call和Ret指令

## ret和retf

ret指令用栈中的数据，修改ip中的内容，从而实现近转移

retf指令用栈中的数据，修改cs和ip中的内容，从而实现远转移

ret相当于pop ip

retf相当于pop ip pop cs

详见

## call指令

call指令常常和ret配合使用，cpu实行call指令，进行两部操作
<li>将当前的ip或cs和ip压入栈中
<li>转移（jmp）

call指令不能实现短转移，除此和jmp原理相同

格式：

call 标号（将当前的ip压栈后，转到标号处执行指令）
16位的位移

可以暂时中断当前函数的执行，跳转到另一个函数所代表的标号处。执行完毕后，通过ret再跳会到原本的指令处

## 转移的目的地址在指令中的call指令

指令 “call far ptr 标号”实现远转移

相当于push cs push ip jmp far ptr 标号

## 转移地址在寄存器中的call指令

格式：call 16位寄存器

## 转移地址在内存中的call指令

call word ptr 内存地址：先push ip 再jmp

call dword ptr 内存地址：先push cs push ip 再jmp

## call和ret的配合使用

例如：
<code>

    assume cs:code
    code segment
        start:
        mov ax,1
        mov cx,3
        call s
        mov bx,ax
        mov ax,4c00h
        int 21h
        s:
        add ax,ax
        loop s
        ret
    code ends
    end start

</code>
其中call s指令让程序跳转到了s指令处执行，执行完毕s处的指令后，又通过ret将栈中存储的原先call处的ip内容取出，跳回call指令处继续往下执行

详见19.asm

## mul指令

mul是乘法指令，使用mul的时候
<li>想乘的两个数，要么都是8位，要么都是16位

若是8位：al寄存器或者内存单元；若是16位：ax寄存器或者内存单元

结果：8位：ax中；16位：dx（高位）和ax（低位）中

格式如下

mul reg；
mul 内存单元（内存单元可以用不同的寻址方式给出）

## 模块化程序设计


