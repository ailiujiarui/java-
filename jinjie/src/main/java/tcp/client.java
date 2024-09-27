package tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class client {
    public static void main(String[] args)throws Exception {
        ServerSocket serverSocket = new ServerSocket(9990);
        Socket socket = serverSocket.accept();
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes= new byte[1024];
        int size=inputStream.read(bytes);
        String ip = socket.getInetAddress().getHostAddress();


        System.out.println("接收到"+ip+"的消息"+new String(bytes,0,size));
        //回复消息
        outputStream.write("baby".getBytes(StandardCharsets.UTF_8));
        socket.close();


    }
}
