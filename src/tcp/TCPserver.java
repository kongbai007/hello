package tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
public class TCPserver {
    public static void main(String[] args)throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("等待连接");
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        byte[] bytes = TCPClient.writerbytes(inputStream);
        BufferedOutputStream buff = new BufferedOutputStream(new FileOutputStream("aa.png"));
        buff.write(bytes);
        buff.flush();
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("已收到".getBytes());
        outputStream.flush();
        accept.shutdownOutput();
        buff.close();
        inputStream.close();
        accept.close();
        serverSocket.close();
    }
}
