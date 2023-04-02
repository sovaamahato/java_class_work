import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file =new File("NayaFile.txt");

        file.createNewFile();

        FileWriter fileWriter =new FileWriter("NayaFile.txt");
        fileWriter.write("Hello naya file ma lekhyam!!!");
        fileWriter.close();

        FileReader fileReader =new FileReader("NayaFile.txt");
        BufferedReader bufferedReader =new BufferedReader(fileReader);

        //to read one line of the file
        String line =bufferedReader.readLine();

        while (line !=null)
        {
            System.out.println(line);
            line =bufferedReader.readLine();
        }

    }
}