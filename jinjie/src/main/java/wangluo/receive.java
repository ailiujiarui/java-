package wangluo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

public class receive {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = null;
        socket = new DatagramSocket(9990);
        DatagramPacket packet = new DatagramPacket(new byte[50], 50);
        socket.receive(packet);
        byte[] buf= packet.getData();
        System.out.println(new String(buf, 0, packet.getLength()));
        socket.close();
    }
}
