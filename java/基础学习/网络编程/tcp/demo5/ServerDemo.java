package 网络编程.tcp.demo5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(12345);

        Socket s = ss.accept();

        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("基础学习\\网络编程\\tcp\\demo5\\demoReceive.txt")));
        BufferedWriter bw2=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;

        while ((line= br.readLine())!=null){
//            if ("886".equals(line)){
//                break;
//            }
            System.out.println("接受到数据："+line);
            bw.write(line);
            bw.newLine();
            bw.flush();

//            bw2.write("我收到数据："+line);
//            bw2.newLine();
//            bw2.flush();
        }
        bw2.write("文件上传成功");
        bw2.newLine();
        bw2.flush();

        ss.close();
        s.close();
        bw.close();
    }
}
