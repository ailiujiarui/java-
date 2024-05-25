package shejimoshi;

public class muban {

    public static void main(String[] args) {
        小学生 小学生=new 小学生();
        小学生.写();
    }
}
abstract  class 写作文{
    final void 写(){
        System.out.println("从前有一个小鸭子");
        act();
        System.out.println("真棒");
    }
   abstract public void act();

}
class 小学生 extends 写作文 {
    @Override
    public void act(){
        System.out.println("小鸭子被做成烤鸭");
    }
}