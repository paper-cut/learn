package 网络编程.tcp.demo2;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket(InetAddress.getByName("wang"),12345);

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;

        while ((line=br.readLine())!=null){
            if ("886".equals(line)){
                break;
            }

//            OutputStream os = s.getOutputStream();
//            os.write(line.getBytes());
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        s.close();
    }
}
