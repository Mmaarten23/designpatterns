package abstract_factory.example.milks;

import abstract_factory.example.FatMilk;

public class ChocolateFatMilk extends FatMilk {
    @Override
    public void drink() {
        System.out.println("drinking ChocolateFatMilk");
    }
}
