package baozhuang;

public class baoz {
    public static void  main(String[] args){

       /* System.out.println(Integer.toBinaryString(112));
        System.out.println(Integer.toOctalString(112));
        System.out.println(Integer.toHexString(112));
        System.out.println(Integer.parseInt("112"));*/
        String s="10,50,30,20,40";
       char chars[]=new char[20];
       int shu[]=new int[5];

       chars=s.toCharArray();
        String[] mid=new String[5];
        int c=0;
        for (int i = 0; i < chars.length-1; i++) {
            if(chars[i]!=','&&chars[i+1]!=','&&c<5){
           mid[c] =Character.toString(chars[i])+Character.toString(chars[i+1]);
           c++;
            }
        }
        for (int i = 0; i < 5; i++) {
            shu[i]=Integer.parseInt(mid[i]);
        }
        int max=0;
        for (int i = 0; i < 5; i++) {
            if(shu[i]>max){
                max=shu[i];
            }
        }
        System.out.println(max);

    }
}
