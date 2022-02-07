package 文件IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class learnIO1 {
    public static void main(String[] args) throws IOException {
//        创建对象
        FileOutputStream fos=new FileOutputStream("fos.txt");
//      写入数据
//        fos.write(97);
        byte[] bytes1 = "1".getBytes();
//        System.out.println(bytes1);
        fos.write(bytes1);
//      释放资源
        fos.close();
    }
}
