package 网络编程;

import java.net.*;

public class InedDemo {
    public static void main(String[] args) throws UnknownHostException, SocketException {
        InetAddress address=InetAddress.getByName("wang");

        System.out.println(address.getHostAddress());
        System.out.println(address.getHostName());

    }
}
