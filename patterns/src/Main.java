import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        Scanner scanner =new Scanner(System.in);
//        System.out.println("enter number of rows:");

        for(int i=0;i<50;i++)
        {
            for(int j=0;j<100;j++)
            {
                System.out.print("*");
            }
            System.out.print(i);
            System.out.println("");
        }
    }
}