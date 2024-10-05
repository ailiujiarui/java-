package fileout;

import jicheng.Student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class xulie {
    public static void main(String[] args) throws Exception {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\A.txt"));

          Student stu = new Student("ikun",18);
          oos.writeObject(stu);
          oos.close();
          ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\A.txt"));
         Object stu1= ois.readObject();
         ois.close();
        System.out.println(stu1);
    }
}
