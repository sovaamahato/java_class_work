import java.io.Serializable;

public class Person implements Serializable {
    int age=20;
    String name = "Sova Kushwaha";

   String address ="Ktm";

    void getName(){
        System.out.println(name);
    }

    void getAge(){
        System.out.println("age  "+ age);
    }
}
