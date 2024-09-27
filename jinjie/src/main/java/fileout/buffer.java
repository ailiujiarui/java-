package fileout;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\A.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\B.txt"));
        /*int i=0;
        while((i=br.read())!=-1){
            bw.write(i);
        }*/
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        bw.close();
    }
}
