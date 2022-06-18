package abstract_factory.example;

public interface MilkFactory {
    FatMilk makeFatMilk();

    MakeLightMilk makeLightMilk();
}
