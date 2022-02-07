package 网络编程.tcp.demo6;

import java.io.*;
import java.net.Socket;

public class ClientThread implements Runnable {
    private Socket s;
    public ClientThread(Socket s) {
        this.s=s;
    }

    @Override
    public void run() {
        try {
            int count=0;
            File file = new File("基础学习\\网络编程\\tcp\\demo6\\copy.txt");
            while (file.exists()){
                count++;
                file=new File("基础学习\\网络编程\\tcp\\demo6\\copy["+count+"].txt");
            }

            BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedWriter bw=new BufferedWriter(new FileWriter(file));

            String line;
            while ((line=br.readLine())!=null){
                System.out.println("接受到数据："+line);

                bw.write(line);
                bw.newLine();
                bw.flush();
            };

            BufferedWriter bwServer=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

            bwServer.write("收到数据，你关机吧");
            bwServer.newLine();
            bwServer.close();

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
