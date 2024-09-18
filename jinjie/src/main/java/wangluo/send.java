package wangluo;

import java.net.*;
import java.net.spi.InetAddressResolver;

public class send {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = null;
            socket = new DatagramSocket(8000);

        //要发送的数据
        String msg="噢 baby~你是~我的~我是~你的谁？";
        InetAddress ind=InetAddress.getByName("127.0.0.1");
        DatagramPacket dags=new DatagramPacket(msg.getBytes(),msg.getBytes().length,ind,9990);
        socket.send(dags);
        socket.close();





    }
}
