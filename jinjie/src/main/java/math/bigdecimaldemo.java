package math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class bigdecimaldemo {
    public static void main(String[] args){
        double num1=0.1;
                double num2=0.2;
        System.out.println(num2+num1);
        /*
        BigDecimal b=new BigDecimal("0.1");
        BigDecimal b1=new BigDecimal("0.2");
        System.out.println(b.add(b1));*/
        BigDecimal bigDecimal = BigDecimal.valueOf(0.11);
        BigDecimal big = BigDecimal.valueOf(0.23);
        System.out.println(big.add(bigDecimal));
        System.out.println(big.subtract(bigDecimal));
        System.out.println(big.multiply(bigDecimal));
        System.out.println(big.divide(bigDecimal,3, RoundingMode.HALF_DOWN));

    }
}
