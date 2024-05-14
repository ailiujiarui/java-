

import java.util.Scanner;
import java.util.ArrayList;
public class Student {
    private int age;
    private String name;
Student(int age, String name) {
    setAge(age);
    setName(name);
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
