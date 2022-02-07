package 文件IO;

import java.io.File;

public class learnFile1 {
    public static void main(String[] args) {
        File f1=new File("itcast\\tt");
//        System.out.println(f1.mkdirs());
//        System.out.println(f1.delete());
        File f2=new File("itcast");
        System.out.println(f2.delete());
    }
}
