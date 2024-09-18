package wangluo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class wangluo {
    public static void main(String[] args) {
        InetAddress ss;
        try {
            ss = InetAddress.getByName("127.0.0.1");
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }

        System.out.println(ss.getHostName());
        System.out.println(ss.getHostAddress());
    }
}
