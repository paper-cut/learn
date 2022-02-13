package SCDemo;

import java.io.*;
import java.net.*;

// 实验获取外网地址并进行通信

public class ServerDemo1 {
    public static void main(String[] args) throws IOException {
//        获取内网IP地址
        System.out.println(InetAddress.getLocalHost().getHostAddress());

        ServerSocket serverSocket = new ServerSocket(6666);
//      Socket socket=new Socket("121.196.35.166",12345);


        while (true) {
            //2.调用accept()等待客户端连接
            Socket socket = serverSocket.accept();
            //3.连接后获取输入流，读取客户端信息
            InputStream is = null;
            InputStreamReader isr = null;
            BufferedReader br = null;
            OutputStream os = null;
            PrintWriter pw = null;
            is = socket.getInputStream();     //获取输入流
            isr = new InputStreamReader(is, "UTF-8");
            br = new BufferedReader(isr);
            String info = null;
            while ((info = br.readLine()) != null) {//循环读取客户端的信息
                System.out.println("客户端发送过来的信息" + info);
            }
            socket.shutdownInput();//关闭输入流

        }
    }
}