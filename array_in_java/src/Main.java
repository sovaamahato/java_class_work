public class Main {
    public static void main(String[] args) {
        //initializing array with value 0
        int[] x=new int[5];
        int[] y={2,3,6,9,10,20,33,8,11,5};

        //for each
        System.out.println("using for each");
        for (int i: y)
        {
            System.out.println(i);
        }
        System.out.println("using for loop");
        for(int i=0;i< y.length;i++)
        {
            System.out.println(y[i]);
        }

//        System.out.println(y[0]);


    }
}