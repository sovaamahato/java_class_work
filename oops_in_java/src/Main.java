public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Shape object= new Shape(10,2);
        System.out.println("width of shape is "+object.width+"\nand height is "+object.height);
        object.area();
    }
}