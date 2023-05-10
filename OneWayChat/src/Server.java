import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);
        System.out.println("enter message");





        try {
            ServerSocket serverSocket =new ServerSocket(12345);

            Socket socket = serverSocket.accept();
            System.out.println("A new client has connected");

            OutputStream outputStream =socket.getOutputStream();
            PrintWriter pw = new PrintWriter(outputStream, true);

            //to prevent from server closing automatically
            while (true){
                String msg = input.nextLine();
                pw.println((msg));
            }


        } catch (IOException e) {
            System.out.println("not connected");
            throw new RuntimeException(e);
        }
    }
}