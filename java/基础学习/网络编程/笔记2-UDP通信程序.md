# UDP通信程序

## 通信原理

UDP协议是不可靠的网络协议，它在通信的两端各建立一个Scoket对象，但是这两个Socket对象只是发送和接受数据

因此基于UDP协议的通信双方而言，没有所谓的客户端和服务器的概念

java提供了DatagramSocket类作为基于UDP协议的Socket

## UDP发送数据

1.创建发送端的Socket对象(DatagramSocket) DatagramSocket()

2.创建数据，并把数据打包 DatagramPacket(byte[] buf,int lenght,InetAddress address,int port)

3.调用DatagramSocket对象的方法发送数据 void send(DatagramPacket p)

4.关闭发送端 void close()

## UDP接收数据

1.创建接收端的Socket对象(DatagramSocket) DatagramSocket(int port)

2.创建一个数据包，用于接受数据 DatagramPacket(byte[] buf,int lenght)

3.调用DatagramSocket对象的方法接收数据 void receive(DatagramPacket p)

4.关闭接收端 void close()


