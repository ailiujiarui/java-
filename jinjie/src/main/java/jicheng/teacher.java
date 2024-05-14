package jicheng;

public class teacher extends Person {
    public teacher() {

    }

    public teacher(String name, int age) {
        //传给父类的带参构造方法，让父类完成初始化
        super(name, age);
    }

    public void teach() {
        System.out.println(super.getName() + "在教数学");
    }
}
