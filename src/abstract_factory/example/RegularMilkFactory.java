package abstract_factory.example;

import abstract_factory.example.milks.RegularFatMilk;
import abstract_factory.example.milks.RegularLightMilk;

public class RegularMilkFactory implements MilkFactory {
    @Override
    public FatMilk makeFatMilk() {
        return new RegularFatMilk();
    }

    @Override
    public MakeLightMilk makeLightMilk() {
        return new RegularLightMilk();
    }
}
