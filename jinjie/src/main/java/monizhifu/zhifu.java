package monizhifu;
import java.util.Scanner;

public class zhifu {
    public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
   System.out.println("请选择支付方式：1，支付平台支付 2，银行卡网银支付 3，信用卡快捷支付");
    int choice =sc.nextInt();
    Payment payment =null;
    switch (choice){
        case 1:
            payment =new ZhiFuPingTai();
            break;
        case 2:
            payment =new YinHangKa();
            break;
        case 3:
            payment =new XinYongKa();
            break;
        default:
            System.out.println("输入错误");
            break;
    }
    System.out.println("请输入您的支付金额: ");
    double money =sc.nextDouble();
    payment.pay(money);


    }
}
