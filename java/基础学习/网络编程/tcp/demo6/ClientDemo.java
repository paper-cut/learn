package 网络编程.tcp.demo6;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket(InetAddress.getByName("wang"),12345);

        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("基础学习\\网络编程\\tcp\\demo6\\demoSend.txt")));

        String line;
        while ((line=br.readLine())!=null){
            System.out.println("读取到数据："+line);

            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        s.shutdownOutput();

        BufferedReader brClient=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String back=brClient.readLine();
        System.out.println("收到反馈："+back);



        s.close();
        br.close();


    }
}
