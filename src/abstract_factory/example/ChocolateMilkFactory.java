package abstract_factory.example;

import abstract_factory.example.milks.ChocolateFatMilk;
import abstract_factory.example.milks.ChocolateLightMilk;

public class ChocolateMilkFactory implements MilkFactory {
    public FatMilk makeFatMilk() {
        return new ChocolateFatMilk();
    }

    public MakeLightMilk makeLightMilk() {
        return new ChocolateLightMilk();
    }
}
