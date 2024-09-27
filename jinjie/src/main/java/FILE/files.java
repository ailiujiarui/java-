package FILE;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class files {
    public static void main(String[] args) throws IOException {
        File parent =new File("F:\\computer\\kaiyuan");
        File file=new File(parent,"windows下zookeeper安装和使用.docx");
       /* System.out.println(file.getAbsolutePath());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.exists());
        System.out.println(file.length());
        System.out.println(file.getPath());
        System.out.println(file.getName());;
        System.out.println(file.lastModified());*/
        File file1 =new File(parent,"a/b/c/a.txt");
        //System.out.println(file1.mkdirs());
        System.out.println(file1.createNewFile());
        System.out.println(file1.delete());
    }
}
