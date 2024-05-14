package monizhifu;

public class YinHangKa implements Payment   {
    @Override
    public void pay(double money) {
        System.out.println("银行卡支付了：" + money + "元");
    }
}
