package 文件IO;

import java.io.FileInputStream;
import java.io.IOException;

public class learnIO2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("id.txt");

        int i;
        byte[] byt=new byte[1024];

        i = fis.read(byt);
        System.out.println(i);

        fis.close();

        String ss=new String();
    }
}
