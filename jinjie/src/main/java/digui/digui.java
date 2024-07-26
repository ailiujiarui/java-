package digui;

public class digui {
    public static void main(String[] args) {
        System.out.println(peach(10));
    }
    public static int m(int n){

        if(n==1){
            return n;}
   else {
            return n+m(n-1);
        }
    }
    public static int feib(int month){
        if (month<=2){
            return 1;
        }
        else
            return feib(month-1)+feib(month-2);
    }
    public  static  int peach(int n){
       if (n==1){
           return 1;
       }
       else
        return (peach(n-1)+1)*2;
    }
}
