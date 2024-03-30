import java.util.Scanner;
import java.util.SplittableRandom;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

   ArrayList<Student> students = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
      for (int i = 0; i < 4; i++) {
            addstudent(students);
      }
   ArrayList<Student> result=   shaixuanstudent(students);
      for (int i = 0; i < result.size(); i++) {
          System.out.println(result.get(i).getName());
      }
      for (int i = 0; i < students.size(); i++) {
          System.out.println(students.get(i).getName());
      }







    }

    public static void addstudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生名字");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        Student stu =new Student(age,name);
        students.add(stu);
    }
   public static ArrayList<Student> shaixuanstudent(ArrayList<Student> students) {
        ArrayList<Student> result = new ArrayList<Student>();
        Student stu = new Student(0,"null");
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAge() <=18) {
                  stu=  students.remove(i);
                i--;
                result.add(stu);
            }
        }
        return result;
   }
}




