package 网络编程.tcp.demo4;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket(InetAddress.getByName("wang"),12345);

        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("基础学习\\网络编程\\tcp\\demo4\\demo.txt")));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;

        while ((line=br.readLine())!=null){
            System.out.println("发送："+line);
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        s.close();
        br.close();
        bw.close();


    }
}
