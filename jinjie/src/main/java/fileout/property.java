package fileout;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class property {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.setProperty("1","ikun");
        FileWriter fw = new FileWriter("D:\\A.txt");
        prop.store(fw,"test");
        fw.close();
    }
}
