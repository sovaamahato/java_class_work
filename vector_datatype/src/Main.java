import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        //array--------
        int[] age1={10,20,30};

        //vector----------------
//        by deafult it will take length =10
//        also we can manually give the length
//        Vector age=new Vector(4);
        Vector age=new Vector();
        age.add(30);
        age.add(40);
        System.out.println("vector size= "+age.size());

        System.out.println("The elements in vector age are:- ");
        for(int i=0;i<age.capacity();i++) {
            System.out.print(age.get(i)+" ");
        }
      }

}