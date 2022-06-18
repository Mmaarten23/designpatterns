package abstract_factory.example;

import abstract_factory.example.ChocolateMilkFactory;
import abstract_factory.example.FatMilk;
import abstract_factory.example.MakeLightMilk;
import abstract_factory.example.MilkFactory;

public class MainMilk {
    public static void main(String[] args) {
        MilkFactory milkFactory = new ChocolateMilkFactory();
        cafe(milkFactory);
    }

    private static void cafe(MilkFactory milkFactory) {
        FatMilk fatMilk = milkFactory.makeFatMilk();
        fatMilk.drink();
        MakeLightMilk lightMilk = milkFactory.makeLightMilk();
        lightMilk.serve();
    }
}
