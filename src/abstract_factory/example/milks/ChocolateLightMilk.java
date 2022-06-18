package abstract_factory.example.milks;

import abstract_factory.example.MakeLightMilk;

public class ChocolateLightMilk extends MakeLightMilk {
    @Override
    public void serve() {
        System.out.println("serving ChocolateLightMilk");
    }
}
