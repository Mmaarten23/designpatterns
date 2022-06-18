package abstract_factory.example.milks;

import abstract_factory.example.FatMilk;

public class RegularFatMilk extends FatMilk {
    @Override
    public void drink() {
        System.out.println("drinking RegularFatMilk");
    }
}
