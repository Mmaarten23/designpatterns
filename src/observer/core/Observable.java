package observer.core;

import java.util.ArrayList;
import java.util.Collection;

public class Observable {
    Collection<ObserverInterface> observers = new ArrayList<>();

    public void addObserver(ObserverInterface observer) {
        observers.add(observer);
    }

    public void removeObserver(ObserverInterface observer) {
        observers.remove(observer);
    }

    public void foo() {
        // ...
        observers.forEach(ObserverInterface::update);
    }
}
