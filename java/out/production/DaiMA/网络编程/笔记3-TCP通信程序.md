# TCP通信程序

## TCP通信原理

TCP通信协议是一种可靠的网络协议，它在通信的两端各建立一个Socket对象，
从而在通信的两端形成网络虚拟链路，一旦形成了虚拟的网络链路，两端就可以通过虚拟链路进行通信

java对基于TCP协议的网络提供了良好的封装，使用Socket对象来代表两端的通信端口，并通过Socket产生IO流来进行网络通信

java为客户端提供了Socket类，为服务器端提供了ServerSocket类

## TCP发送数据

1.发送客户端的Socket对象 Socket(String host,int port)

2.获取输出流，写数据 OutpubStream getOutputStream()

3.释放资源 void close()

### shutdowmOutput()
Socket.shutdownOutput()方法代表结束此输出流

## TCP接收数据

1.创建服务器端的Socket对象(ServerSocket) ServerSocket(int port)

2.监听客户端链接，返回一个Socket对象 Socket accept()

3.获取输入流，读数据，并把数据显示在控制台 InputStream getInputStream()

4.释放资源 void close()