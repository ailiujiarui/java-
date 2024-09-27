package fileout;

import java.io.FileReader;

public class IO {
    public static void main (String[] args) throws Exception {
      FileReader fr = new FileReader("D:\\A.txt");

      char[] i=new char[100];
      int len=fr.read(i);
      System.out.println(new String(i,0,len));
    }
}
