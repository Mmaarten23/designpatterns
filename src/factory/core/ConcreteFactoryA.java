package factory.core;

public class ConcreteFactoryA extends Factory {
    @Override
    public Product create() {
        return new ProductA();
    }
}
