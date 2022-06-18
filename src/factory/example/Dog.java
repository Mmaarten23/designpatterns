package factory.example;

public class Dog implements Animal {
    @Override
    public void pet() {
        System.out.println("Woof!");
    }
}
