package fanshe;

import jicheng.Student;

import java.util.ArrayList;

public class fanshe {
    public static void main(String []args) throws ClassNotFoundException {
        //静态方法forName
       Class<?> class1= Class.forName("jicheng.Student");
       //类名.class
        Class<Student> class2=Student.class;
        //getClass()方法
        Student stu=new Student();
        Class<? extends Student> aClass = stu.getClass();


        System.out.println(class1==class2);
    }
    public  static<T> void kun(T e){

    }
    public void kun2(ArrayList<? extends Student> qq){}

}
