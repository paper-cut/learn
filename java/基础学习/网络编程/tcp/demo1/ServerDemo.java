package 网络编程.tcp.demo1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket s=new ServerSocket(12345);

        Socket ss=s.accept();

        InputStream is = ss.getInputStream();
        byte[] bys=new byte[1024];
        int len = is.read(bys);
        String data=new String(bys,0,len);
        System.out.println("数据时："+data);

        OutputStream os = ss.getOutputStream();
        os.write("数据已经收到".getBytes());

        s.close();
        ss.close();
    }
}
