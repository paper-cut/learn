package 文件IO.learnio;

import java.io.*;

public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        File srcFolder = new File("E:\\VPN");
        File destFolder = new File("D:\\");

        copyFolder(srcFolder,destFolder);
    }

    private static void copyFolder(File srcFolder, File destFolder) throws IOException {
        if (srcFolder.isDirectory()){
            String name = srcFolder.getName();
            File newFolder = new File(destFolder, name);
            if (!newFolder.exists()){
                newFolder.mkdir();
            }

            File[] listFiles = srcFolder.listFiles();
            for (File file:listFiles){
                copyFolder(file,newFolder);
            }

        }else {
            File destFile = new File(destFolder, srcFolder.getName());
            copyFile(srcFolder,destFile);
        }
    }

    private static void copyFile(File file, File newFolder) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(newFolder));

        byte[] bt=new byte[1024];
        int len;
        while ((len=bis.read(bt))!=-1){
            bos.write(bt);
            bos.flush();
        }

        bis.close();
        bos.close();
    }
}
