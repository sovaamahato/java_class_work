public class Shape {
    public int width;
    public int height;

    //default constructor
    Shape()
    {
        width=10;
        height=20;
    }

    //parameter constructor
    Shape(int a,int b)
    {
        width =a;
        height=b;
    }

    public void area(){
        System.out.println("Area of shape = "+ width*height);
    }
}
