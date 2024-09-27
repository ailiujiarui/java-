package fileout;

import java.io.*;

public class Fileout {
    public static void main(String[] args) throws Exception  {
       /* FileOutputStream fos=null ;
        try {
            fos=new FileOutputStream("D:\\A.txt",true);
            byte[] buf = {68,67,66};
            fos.write(buf,0,1);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                fos.write(1080);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }*/
       /* //实现文件的拷贝
        FileInputStream fos = null;
        try {
            //先读取文件
            fos = new FileInputStream("D:\\g.jpg");
            byte[] x = new byte[fos.available()];
            System.out.println(fos.read(x));
            System.out.println(new String(x));
            fos.close();

            //再复制文件
            FileOutputStream fos2 = new FileOutputStream("E:\\g.jpg");
            fos2.write(x);
            fos2.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }*/
        //缓冲流对IO流进行包装
        FileInputStream fos =new FileInputStream("D:\\A.txt");
        BufferedInputStream bis =new BufferedInputStream(fos);
        FileOutputStream fos2 = new FileOutputStream("D:\\A2.txt");
        BufferedOutputStream bos =new BufferedOutputStream(fos2);
        bos.write(bis.readAllBytes());
        bos.close();
        bis.close();
    }
}
