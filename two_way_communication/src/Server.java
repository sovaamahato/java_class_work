import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {


        try {
            ServerSocket serverSocket= new ServerSocket(12345);
            Socket socket =serverSocket.accept();
            System.out.println("A client is connected");

//            InputStream inputStream= socket.getInputStrem();
//            InputStreamReader inputStreamReader =new InputStreamReader(socket.);


            //this  is for getting socket value(message)

            BufferedReader socketDataReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //this is for user typed input
            BufferedReader userInputReader=new BufferedReader(new InputStreamReader(System.in));
        //i need a pen to write the message
            OutputStream outputStream= socket.getOutputStream();
            PrintWriter printWriter =new PrintWriter(outputStream,true);

            String sendingMessage, receivingMeaasge;

            while (true){

                //sending to client
              sendingMessage=  userInputReader.readLine();
              printWriter.println(sendingMessage);
              printWriter.flush();


              //receiving message from client
                receivingMeaasge = socketDataReader.readLine();
                System.out.println("Client :  "+receivingMeaasge);
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}