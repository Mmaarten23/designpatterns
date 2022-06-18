package abstract_factory.core;

import abstract_factory.core.products.ProductAVariantA;
import abstract_factory.core.products.ProductBVariantA;

public class VariantAFactory implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ProductAVariantA();
    }

    @Override
    public ProductB createProductB() {
        return new ProductBVariantA();
    }
}
