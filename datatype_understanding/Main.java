import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        // System.out.println("Enter your name:");
        System.out.print("Enter two number:");
        Scanner obj1 = new Scanner(System.in);

        // String name =obj1.nextLine();         //nextInt for getting integer value
        int number1 =obj1.nextInt();
        int number2 =obj1.nextInt();
        
        
        // System.out.println("my name is:"+ name );
        System.out.println("The result is "+number1 * number2 );



    }
}