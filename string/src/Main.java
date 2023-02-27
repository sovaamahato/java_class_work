public class Main {
    public static void main(String[] args) {
//this will be created on the string pool
        String name ="Sovaa";
        System.out.println(name);
        String name1 ="Sovaa";

        //this will create the new instance of the string
        String name2 = new String("hello world");
        StringBuffer name3 =new StringBuffer("soovaaa");
        name3.append(" kushwaha");
        System.out.println(name3);


    }
}