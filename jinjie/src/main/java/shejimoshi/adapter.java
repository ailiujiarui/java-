package shejimoshi;

public class adapter {
    public static void main(String[] args) {
        me me= new me();
        he he=new he();
        me.chicai();
        he.hezhou();
    }
}
interface chifan{

    void hezhou();
    void chicai();
    void chimian();

}
//使用适配器模式，省去很多的重写代码，让代码显得简洁
abstract class chifanadapter implements chifan{
    @Override
    public void hezhou() {

    }

    @Override
    public void chicai() {

    }

    @Override
    public void chimian() {

    }
}
class me extends chifanadapter{

    @Override
    public void chicai() {
        System.out.println("吃菜");
    }


}
class he extends chifanadapter{
    @Override
    public void hezhou(){
        System.out.println("爱喝粥");
    }
}