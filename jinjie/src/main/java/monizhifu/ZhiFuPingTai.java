package monizhifu;

public class ZhiFuPingTai implements Payment {
    @Override
    public void pay(double money) {
        System.out.println("支付平台支付了：" + money + "元");
    }
}
