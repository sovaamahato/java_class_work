import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.io.IOException;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket=new DatagramSocket();

        String message ="Hello world";

        InetAddress address =InetAddress.getByName("localhost");

        //message, message length, tesko address and port
        DatagramPacket packet = new DatagramPacket(message.getBytes(),message.length(),address, 12345);

        //sending packing via socket
        System.out.println("Sending message...........");
        socket.send(packet);

    }
}