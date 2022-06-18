package abstract_factory.example.milks;

import abstract_factory.example.MakeLightMilk;

public class RegularLightMilk extends MakeLightMilk {
    @Override
    public void serve() {
        System.out.println("serving RegularLightMilk");
    }
}
