package jicheng;

public class Student extends Person implements Comparable<Student>{
    private double score;
    public Student() {
    }

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }
    public Student(String name, int age) {
        super(name, age);
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public void study() {
        System.out.println("姓名为"+getName()+",年龄为"+getAge()+",成绩为"+getScore() + " is studying.");
    }
    public boolean equal(Student s){
        if(this.score==s.score)
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Double.compare(score, student.score) == 0;
    }

    @Override
    public int compareTo(Student o) {
        //System.out.println(this.getName()+"-----"+o.getName());
        int res =this.getAge()-o.getAge();
        int result = res==0 ? this.getName().compareTo(o.getName()):res;

        return result;
    }
}
