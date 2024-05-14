package org.example;

public class Student {
    private int age;
    private String name;
    private String xuehao;
    private String shengri;
    Student(){}
   Student(int age, String name, String xuehao, String shengri) {
    setAge(age);
    setName(name);
    setXuehao(xuehao);
    setShengri(shengri);
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

    public String getXuehao() {
        return xuehao;
    }

    public void setXuehao(String xuehao) {
        this.xuehao = xuehao;
    }

    public String getShengri() {
        return shengri;
    }

    public void setShengri(String shengri) {
        this.shengri = shengri;
    }


    public String toString() {
        return "学生" +
                "年龄=" + age +"\t"+
                "姓名=" + name + '\t' +
                "学号=" + xuehao + '\t' +
                "生日=" + shengri +"\t";
    }
}
