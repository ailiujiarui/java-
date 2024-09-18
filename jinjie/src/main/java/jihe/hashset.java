package jihe;

import jicheng.Student;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
       HashSet<Student> set=new HashSet<>();
        set.add(new Student("张三",25,99));
        set.add(new Student("李四",23,9));
        set.add(new Student("王五",25,119));
        set.add(new Student("王6",23,93));
        set.add(new Student("张三",25,59));
        System.out.println(set);
    }
}
