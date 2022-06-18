package composite.example;

public class MainClass {
    public static void main(String[] args) {
        AbstractClass root = new AbstractClass();
        AbstractClass sub1 = new AbstractClass();
        Class c = new Class(400);

        root.addSubType(new Class(100));
        sub1.addSubType(new Class(200));
        sub1.addSubType(c);
        root.addSubType(sub1);

        System.out.println("root: " + root.getMaxInstances());
        System.out.println("sub1: " + sub1.getMaxInstances());
        System.out.println("c: " + c.getMaxInstances());
    }
}
