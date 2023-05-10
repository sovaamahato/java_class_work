public class Rectangle implements Shape, AnotherShape{
    @Override
    public void printArea(){
        System.out.println("from shape");
    }
    

    @Override
    public void getName() {
        System.out.println(" from another shape");
    }
}
