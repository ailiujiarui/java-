package monizhifu;

public class XinYongKa implements Payment   {
    @Override
    public void pay(double money) {
        System.out.println("信用卡支付了：" + money + "元");
    }
}
