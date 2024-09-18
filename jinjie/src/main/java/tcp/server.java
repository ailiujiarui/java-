package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class server {
     public static void main(String[] args)throws Exception {
    Socket socket = new Socket("127.0.0.1",9990);
    OutputStream os = socket.getOutputStream();
    InputStream is = socket.getInputStream();
    os.write("ikun".getBytes());
    byte[] buf = new byte[1024];
    int len0 = is.read(buf);

         System.out.println(new String(buf,len0));
    socket.close();
     }
}
