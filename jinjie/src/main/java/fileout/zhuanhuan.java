package fileout;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class zhuanhuan {
    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\A.txt"), StandardCharsets.UTF_8);
        char[] buf = new char[1024];
       int len=isr.read(buf);
        System.out.println(new String(buf, 0, len));
    }
}
