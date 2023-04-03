import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//to write object in a file
        FileOutputStream fileOutputStream =new FileOutputStream("Sova.txt");

        ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileOutputStream);
        Person p1 =new Person();
        objectOutputStream.writeObject(p1);

        //to get(read) object in a file
        FileInputStream fileInputStream=new FileInputStream("Sova.txt");
        ObjectInputStream objectInputStream =new ObjectInputStream(fileInputStream);

        Person p2 =(Person) objectInputStream.readObject();
        p2.getName();
        p2.getAge();

    }
}