package tcp;

import java.io.*;
import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
public class TCPClient {
    public static void main(String[] args
     )throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        OutputStream outputStream = socket.getOutputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\32991\\Pictures\\屏幕截图 2025-04-09 163106.png"));
        outputStream.write(writerbytes(bufferedInputStream));
        outputStream.flush();
        //socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        byte[] writerbytes = writerbytes(inputStream);
        System.out.println(new String(writerbytes));
        System.out.println("客户端退出");
        bufferedInputStream.close();
        outputStream.close();
        socket.close();
    }
    public static byte[] writerbytes(InputStream in) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bytes = new byte[1024];
        int readlen=0;
        while ((readlen=in.read(bytes))!=-1){
            byteArrayOutputStream.write(bytes,0,readlen);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return byteArray;
    }

}