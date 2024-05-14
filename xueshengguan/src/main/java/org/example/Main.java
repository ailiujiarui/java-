package org.example;

import java.util.Scanner;
import java.lang.System;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 创建学生列表,增删改查都围绕着这个集合进行
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);

        students.add(new Student( 20, "张三","222111","2000-01-01"));
        while (true) {
            System.out.println("学生管理系统");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出系统");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("请按顺序输入姓名，学号，年龄，生日");
                    addStudent(scanner.next(),scanner.next(),scanner.nextInt(),scanner.next(),students);
                    break;
                case 2:
                    System.out.println("请按顺序输入姓名，学号");
                    removeStudent(scanner.next(),scanner.next(),students);
                    break;
                case 3:
                    System.out.println("请按顺序输入学号，姓名");
                    modifyStudent(scanner.next(),scanner.next(),students);
                    break;
                case 4:
                    chakanstudent(students);
                    break;
                case 5:
                    System.out.println("感谢您的使用，再见");

                    System.exit(0);
                default:
                    System.out.println("您的输入有误请检查");
            }
        }

    }
    public static void chakanstudent(ArrayList<Student> students) {
        if (students.size() == 0) {
            System.out.println("查无信息，请稍后重试");
            return;}
        else {
        // 打印学生列表
        for (Student student : students) {
            System.out.println(student.toString());
        }}

    }
    static int getIndex(String xuehao,ArrayList<Student> students){
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getXuehao().equals(xuehao)) {
                return i;

            }
        }
        return -1;
    }
    static void removeStudent(String xuehao,String id,ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getXuehao().equals(xuehao) && students.get(i).getName().equals(id)) {
                students.remove(i);
                System.out.println("删除成功");
                return;
            }
            else {System.out.println("删除失败，请检查输入信息");return;}
        }}

            static void modifyStudent(String xuehao,String id,ArrayList<Student> students) {
            Scanner scanner = new Scanner(System.in);
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).getXuehao().equals(xuehao) && students.get(i).getName().equals(id) ){
                        System.out.println("请输入修改后的姓名：");
                        String name = scanner.next();
                        System.out.println("请输入修改后的学号：");
                        String xuehao1 = scanner.next();
                        System.out.println("请输入修改后的生日：");
                        String birthday = scanner.next();
                        System.out.println("请输入修改后的年龄：");
                        int age1 = scanner.nextInt();
                        students.get(i).setName(name);
                        students.get(i).setXuehao(xuehao1);
                        students.get(i).setShengri(birthday);
                        students.get(i).setAge(age1);
                        System.out.println("修改成功");
                        return;

                    }
                    else  {
                        System.out.println("修改失败，请检查输入信息");return;}

                }}



    static void addStudent(String name,String xuehao,int age,String shengri,ArrayList<Student> students){
        Student student = new Student(age,name,xuehao,shengri);
        getIndex(xuehao,students);
        if (getIndex(xuehao,students)!=-1){
            System.out.println("添加失败，学号已存在");
            return;
        }
        students.add(student);
        System.out.println("添加成功");

    }
    }
