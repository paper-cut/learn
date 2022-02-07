package 网络编程.tcp.demo4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(12345);

        Socket s = ss.accept();

        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("基础学习\\网络编程\\tcp\\demo4\\demo2.txt")));

        String line;
        while ((line=br.readLine())!=null){
            System.out.println("收到并写入数据："+line);

            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        ss.close();
        s.close();
        br.close();
        bw.close();
    }
}
