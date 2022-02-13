package SCDemo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientDemo1 {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("121.196.35.166",6666);
        s.setSoTimeout(10000000);
//        s.connect(new InetSocketAddress("121.196.35.166",6666));

        BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        bf.write("你好");
        bf.flush();
        bf.close();



    }
}
