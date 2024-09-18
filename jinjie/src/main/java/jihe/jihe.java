package jihe;

import jicheng.Student;

import java.util.*;

public class jihe {
    public static void  main(String []args){
        //以多态方式创建集合对象，方便调用通用方法
       /* Collection<String> ss=new ArrayList<>();

        ss.add("张三");
        ss.add("张三1");
        ss.add("张三2");
        ss.add("张三3");
        ss.add("张三4");
       *//* System.out.println(ss.isEmpty());
        System.out.println(ss.size());*//*
        *//*ss.add(new Student("ku",18,30));
        ss.add(new Student("kun",14,90));
        System.out.println(ss);
        ss.remove(new Student("ss",18,30));
        System.out.println(ss);*//*

        //获取迭代器
        Iterator<String> a= ss.iterator();
       *//* for (int i = 0; i < ss.size(); i++) {
            System.out.println(a.next());
        }*//*
        for (String c:ss) {
            System.out.println(c);
        }*/
        List<String> ls =new ArrayList<>();

        ls.add("kunkun");
        ls.add("kunkun");
        ls.add("kunkun");;
        ls.add(2,"S");
        ls.set(2,"jump");
        ListIterator<String> iterator = ls.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("___________________");
        while (iterator.hasPrevious()){
            ls.add("S");
            System.out.println(iterator.previous());
        }
    }
}
