public class Main {
    public static void main(String[] args) {

        int [] x={1,20,30};
        int[][] y= {{10,20,3},
                {11,21,30},
                {2,5,22},
                {41,25,60},
                {41,25,60}
        };
//        System.out.println(y[0][1]);

        //loop for 1dimension array
//        for(int i=0;i<x.length;i++)
//        {
//            System.out.println(x[i]);
//        }

        //loop for  2 dimension array
        System.out.println("length "+y.length);
        for(int i=0;i<y.length;i++)
        {
            for(int j=0;j<y[i].length;j++)
            System.out.print(y[i][j]+" ");
            System.out.println("");

        }

    }
}