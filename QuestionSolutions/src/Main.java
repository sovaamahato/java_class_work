//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner input =new Scanner(System.in);
//        System.out.println("Enter a Number:");
//        int num = input.nextInt();
//        int flag=0;
//
//        for(int i=0;i<num;i++)
//        {
//            if(num/i==0){
//                flag=flag+1;
//            }
//
//
//
//
//        }
//
//        if(flag>=2)
//        {
//            System.out.println(num +" is not a prime number");
//
//        }
//        else {
//            System.out.println(num +" is  a prime number");
//        }
//    }
//}

//question2.
//find sum of all elements of the array


//public class Main {
//    public static void main(String[] args) {
//        int[] arr={5,4,3,4,2};
//        int sum=0;
//
//
//       for(int i:arr){
//           sum = sum+i;
//
//       }
//        System.out.println("---------------------------------------");
//        System.out.println("The sum of all elements of array is "+sum);
//    }
//}

//question 3 pattern icecream cone
public class Main {
    public static void main(String[] args) {

        for(int i=0;i<5;i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");

            }
            for(int k=5;k>i;k--)
            {
                System.out.println("* ");
            }
            System.out.println("\n");
        }


    }
}

//ques 4

//public class Main {
//    public static void main(String[] args) {
//
//        int[] arr={4,6,9,2,12,24,-1};
//        for(int i=0;i<arr.length;i++)
//        {
//            for(int j=0;j<arr.length;j++)
//            {
//                if(arr[i]<arr[j])
//                {
//                    int temp =arr[j];
//                    arr[j]=arr[i];
//                    arr[i]=temp;
//
//                }
//            }
//        }
//        System.out.println("min ele is "+ arr[0]);
//        int n=arr.length-1;
//        System.out.println("max ele is "+ arr[n]);
//        for(int i=0;i<arr.length;i++){
//
////            System.out.println("min ele is "+ arr[i]);
//        }



    }
}
