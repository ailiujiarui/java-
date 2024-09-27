package wangluo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class client {
    public static void main(String[] args)  throws Exception{
        DatagramSocket socket = new DatagramSocket(9990);
        byte[] buf ;
        System.out.println("聊天室开启");
        while(true){
        DatagramPacket packet = new DatagramPacket(new byte[1024],1024);
        socket.receive(packet);
        buf = packet.getData();
        String msg=new String(buf,0,packet.getLength());
        System.out.println(msg);

        if(msg.equals("exit")){
            break;
        }
        }
        socket.close();
    }
}
