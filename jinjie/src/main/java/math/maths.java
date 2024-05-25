package math;
import java.math.*;
public class maths {
    public static void main(String[] args){
        //取绝对值
        System.out.println(Math.abs(-1));
        //向上取整
        System.out.println(Math.ceil(-1.1));
        //向下取整
        System.out.println(Math.floor(-1.1));
        //四舍五入
        System.out.println(Math.round(3.4));
        //比较
        System.out.println(Math.max(3, 99));
        System.out.println(Math.min(3, 99));
        //次方
        System.out.println(Math.pow(2, 3));
        //随机
        System.out.println(Math.random());

        //输出时间戳
        System.out.println(System.currentTimeMillis());
        int arr[]=new int[]{1,2,3,4};
        int destarr[]={0,0};
        System.arraycopy(arr,1,destarr,0,2);
        for (int i = 0; i <2 ; i++) {
            System.out.println(destarr[i]);
        }


    }
}
