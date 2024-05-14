package duotai;

public class duotai {
    public static void  main(String[] args){
        Animal a =new Dog();
        System.out.println(a.eas);
        a.sleep();
        System.out.println(a.eas);
    }

}
 class Animal{
   static int eas=10;
    public  void eat(){
        System.out.println("动物吃东西");
    };
    public static void sleep(){
        System.out.println("动物睡觉");
    }
}
class Dog extends Animal{
   static int eas=20;
    @Override
    public void eat(){
        System.out.println("狗吃骨头");
    }
    public static void sleep(int eas){
        System.out.println("狗睡觉");

    }

}

class Cat extends Animal{
    int eas=30;
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
}
