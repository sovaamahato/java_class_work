import java.io.*;
import java.nio.file.FileVisitResult;

public class Main {
    public static void main(String[] args) throws IOException {
        //step 1---------
        File file = new File("Sova.txt");

            //to create file
            //step 2----------
            file.createNewFile()  ;


        //write something on this file

            //step 3----------------
            FileWriter fileWriter =new FileWriter("Sova.txt");
            fileWriter .write("Hello its me sova");
            fileWriter.close();



        //to read file

            //step 4----------------
            //filereader le euta character at a time read garxa so loop laaune
            FileReader fileReader =new FileReader("Sova.txt");
            int value;
            while((value=  fileReader.read())!=-1){
                System.out.print((char)value);
            }



        //deleting file
        file.delete();


    }
}