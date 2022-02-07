package 文件IO;

import java.io.File;

public class learnFile2 {
    public static void main(String[] args) {

        File srcFile=new File("D:\\");
        getAllFilePath(srcFile);
    }

    private static void getAllFilePath(File srcFile) {
        File[] files = srcFile.listFiles();
        if (files!=null){
            for(File file:files){
                if (file.isDirectory()){
                    getAllFilePath(file);
                }else {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
