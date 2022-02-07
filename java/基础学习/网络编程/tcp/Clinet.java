package 网络编程.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Clinet {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket(InetAddress.getByName("wang"),12345);

        OutputStream os = s.getOutputStream();

        os.write("holle tcp".getBytes());

        os.close();
        s.close();
    }
}
