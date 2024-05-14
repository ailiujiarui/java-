package neibu;

public class neibu {
    public static void main(String[] args) {
        useInterA((a,b)-> a


        );
        useInterA(new InterA(){
            @Override
            public int show(int a,int b){
                System.out.println(a);
                return a;
            }
                  }
        );
    }
    public static void useInterA(InterA a){
        int c=0;
        int b=1;
        a.show(c,b);

    }
}
@FunctionalInterface
interface InterA{
    int show(int a,int b);

}