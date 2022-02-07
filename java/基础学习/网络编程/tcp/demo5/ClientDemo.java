package 网络编程.tcp.demo5;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket(InetAddress.getByName("wang"),12345);

        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("基础学习\\网络编程\\tcp\\demo5\\demoSend.txt")));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));


        BufferedReader br2=new BufferedReader(new InputStreamReader(s.getInputStream()));

        String line;

        while ((line=br.readLine())!=null){
            System.out.println("数据发送："+line);
            bw.write(line);
            bw.newLine();
            bw.flush();

//            String line2=br2.readLine();
//            System.out.println("接受反馈："+line2);
        }

        s.shutdownOutput();
        String line2=br2.readLine();
        System.out.println("收到服务器反馈"+line2);

        s.close();
        br.close();


    }
}
