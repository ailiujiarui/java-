package jihe;
import java.util.TreeSet;
import jicheng.Student;

public class treeset {
    public static void main(String[] args) {
        TreeSet<Student> ts=new TreeSet<>();
        ts.add(new Student("张三",25,99));
        ts.add(new Student("李四",23,99));
        ts.add(new Student("王五",25,99));
        ts.add(new Student("王6",23,99));
        System.out.println(ts);
    }
}
