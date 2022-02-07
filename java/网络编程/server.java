import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Enumeration;

public class server {

    public static String getServAddr() {

        try {
            Enumeration<NetworkInterface> allNetInterfaces = NetworkInterface.getNetworkInterfaces();
            while (allNetInterfaces.hasMoreElements()) {
                NetworkInterface netInterface = (NetworkInterface) allNetInterfaces.nextElement();

                // 去除回环接口，子接口，未运行和接口
                if (netInterface.isLoopback() || netInterface.isVirtual() || !netInterface.isUp()) {
                    continue;
                }

                Enumeration<InetAddress> addresses = netInterface.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    InetAddress ip = addresses.nextElement();
                    if (ip != null) {
                        // ipv4
                        if (ip instanceof Inet4Address) {
                            if (ip.getHostAddress().startsWith("192") || ip.getHostAddress().startsWith("10")
                                    || ip.getHostAddress().startsWith("172") || ip.getHostAddress().startsWith("169")) {
                                return ip.getHostAddress();
                            }
                        }
                    }
                }
            }
        } catch (SocketException e) {
            System.err.println("Error when getting host ip address"+ e.getMessage());
        }

        return "";
    }

    public static void main(String[] args) throws IOException {

        //1.创建一个服务器端 Socket，即 ServerSocket， 指定绑定的端口，并监听此端口

        ServerSocket serverSocket = new ServerSocket(12345);

        System.out.println("服务器已经运行在" + getServAddr() + ":12345 ，等待客户端发送数据");

        while ( true ) {

            //2.调用accept()等待客户端连接
            Socket socket = serverSocket.accept();

            //3.连接后获取输入流，读取客户端信息
            InputStream is=null;
            InputStreamReader isr=null;
            BufferedReader br=null;
            OutputStream os=null;
            PrintWriter pw=null;
            is = socket.getInputStream();     //获取输入流
            isr = new InputStreamReader(is,"UTF-8");
            br = new BufferedReader(isr);
            String info = null;
            while((info=br.readLine())!=null){//循环读取客户端的信息
                System.out.println("客户端发送过来的信息" + info);
            }
            socket.shutdownInput();//关闭输入流
        }
    }
}