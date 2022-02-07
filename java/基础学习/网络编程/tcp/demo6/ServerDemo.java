package 网络编程.tcp.demo6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(12345);
        while (true) {
            Socket s = ss.accept();

            new Thread(new ClientThread(s)).start();
        }



    }
}
