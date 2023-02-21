import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner obj1=new Scanner(System.in);
        System.out.println("enter your age: ");
        int age =obj1.nextInt();
//        if(age==40)
//        {
//            System.out.println("your age is "+ age+" buy a new house");
//        } else if (age==60) {
//            System.out.println("your age is " + age +" so you are retired");
//
//        } else {
//            System.out.println("your age is " + age +" so Buy a new car");
//        }


//        int age=40;
        switch (age){
            case 40:
                System.out.println("buy an new car");
                break;
            case 60:
                System.out.println("i will retired");
                break;
            default:
                System.out.println("buy old car");
        }

    }
}