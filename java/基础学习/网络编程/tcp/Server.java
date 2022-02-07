package 网络编程.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(12345);

        Socket sc = ss.accept();

        InputStream is = sc.getInputStream();

        byte[] bys=new byte[1024];
        int len=is.read(bys);
        String data=new String(bys,0,len);

        System.out.println(data);

        ss.close();
        sc.close();
        is.close();
    }
}
