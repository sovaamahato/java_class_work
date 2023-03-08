public class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("barks");
    }

    @Override
    void getName() {
        System.out.println("Animal Name: Dog");
    }
}
