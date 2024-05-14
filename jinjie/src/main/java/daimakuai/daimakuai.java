package daimakuai;

public class daimakuai {
    public static void main(String arg[]){
        int num=1;
        System.out.println("num："+num);
        {
             num=0;
            System.out.println("num："+num);
            System.out.println("这是局部代码快");
        }
       Kuai kuai = new Kuai();
    }
}
class Kuai{
   static int num;
    {
        System.out.println("构造代码块");
    }
    static {
     num=0;
        System.out.println("num："+num);
        System.out.println("静态代码块");
    }
    Kuai(){
        System.out.println("这是一个构造方法");
    };

}