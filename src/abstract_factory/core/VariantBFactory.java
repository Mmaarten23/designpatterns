package abstract_factory.core;

import abstract_factory.core.products.ProductAVariantB;
import abstract_factory.core.products.ProductBVariantB;

public class VariantBFactory implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ProductAVariantB();
    }

    @Override
    public ProductB createProductB() {
        return new ProductBVariantB();
    }
}
