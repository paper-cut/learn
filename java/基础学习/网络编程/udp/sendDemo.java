package 网络编程.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class sendDemo {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket
        DatagramSocket ds=new DatagramSocket();
        //创建数据包
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //
        String line;
        while ((line=br.readLine())!=null){
            if ("886".equals(line)){
                break;
            }
            byte[] bt=line.getBytes();
            DatagramPacket dp=new DatagramPacket(bt,bt.length, InetAddress.getByName("wang"),12345);
            ds.send(dp);
        }

        ds.close();
    }
}
