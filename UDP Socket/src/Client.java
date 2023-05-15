import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.io.IOException;

public class Client {
    public static  void main(String[] args) throws IOException{
        System.out.println("Client started");
        DatagramSocket socket =new DatagramSocket(12345);

        byte[] dataPacket =new byte[1024];
        DatagramPacket packet =new DatagramPacket(dataPacket,dataPacket.length);
        socket.receive(packet);
        String receivedMessage= new  String (packet.getData(),0,packet.getLength());
        System.out.println(receivedMessage);


    }


}
