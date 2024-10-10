package danli;

public class danli1 {
    public static void main(String[] args) {

    }
}

//饿汉式单例设计
class dan1{
    private dan1(){}

   private static  dan1 ss = new dan1();
    public static dan1 getInstance(){
        return ss;
    }
}
//懒汉式
class dan2{
    private dan2(){}
    private static  dan2 ss;
    public static dan2 getInstance(){
        if(ss == null){
            synchronized (dan2.class){
                if(ss == null){
                    ss = new dan2();
                }
            }
        }
        return ss;
    }
}