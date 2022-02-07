package 网络编程.tcp.demo1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket(InetAddress.getByName("wang"),12345);

        OutputStream os = s.getOutputStream();
        os.write("hello，tcp，我来了".getBytes());

        InputStream is = s.getInputStream();
        byte[] bys=new byte[1024];
        int len=is.read(bys);
        String data=new String(bys,0,len);

        System.out.println("服务器端："+data);

        s.close();
    }
}
