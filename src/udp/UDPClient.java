package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(7777);
        byte[] buffer = "你好".getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(),8888);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
