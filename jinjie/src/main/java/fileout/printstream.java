package fileout;

import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

public class printstream {
    public static void main(String[] args) throws Exception {
       /* PrintStream out= new PrintStream("D:\\A.txt","GBK");
        out.write(97);
        out.println(97);   out.print(97);*/
       PrintWriter out = new PrintWriter(new FileWriter("D:\\A.txt",true),true);
        out.println("Hello World");
    }
}
