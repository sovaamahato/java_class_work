import java.io.*;
import java.net.Socket;

public class Client {
    public static void main (String[] args){
        try {
            Socket socket =new Socket("127.0.0.1", 12345);
            //Socket socket =new Socket("192.168.137.85", 12345);


            //this  is for getting socket value(message)
            BufferedReader socketDataReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //this is for user typed input
            BufferedReader userInputReader=new BufferedReader(new InputStreamReader(System.in));
            //i need a pen to write the message
            OutputStream outputStream= socket.getOutputStream();
            PrintWriter printWriter =new PrintWriter(outputStream,true);

            String sendingMessage, receivingMeaasge;

            while (true){
                //receiving message from client
                receivingMeaasge = socketDataReader.readLine();
                System.out.println("Server:  "+receivingMeaasge);

                //sending to client
                sendingMessage=  userInputReader.readLine();
                printWriter.println(sendingMessage);
                printWriter.flush();



            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
