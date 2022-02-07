package 网络编程.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class receiveDemo {
    public static void main(String[] args) throws IOException {
        //创建Socket
        DatagramSocket ds=new DatagramSocket(12345);

        //创建接受的数据包
        while (true) {
            byte[] bt = new byte[1024];

            DatagramPacket dp = new DatagramPacket(bt, bt.length);

            ds.receive(dp);

            System.out.println("数据是"+new String(dp.getData(),0,dp.getLength()));
        }
//        ds.close();
    }
}
