package observer.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Train {
    private final List<TrainObserver> observers = new ArrayList<>();
    private int position = 0;

    public void addObserver(TrainObserver observer) {
        if (observer == null) {
            throw new IllegalArgumentException("Observer is null");
        }
        if (observers.contains(observer)) {
            throw new IllegalArgumentException("Observer already added");
        }
        observers.add(observer);
    }

    public void removeObserver(TrainObserver observer) {
        if (observer == null) {
            throw new IllegalArgumentException("Observer is null");
        }
        if (!observers.contains(observer)) {
            throw new IllegalArgumentException("Observer not added");
        }
        observers.remove(observer);
    }

    public void updateObservers() {
        for (TrainObserver observer : getObservers()) {
            observer.update(this);
        }
    }

    private List<TrainObserver> getObservers() {
        return Collections.unmodifiableList(observers);
    }

    public int getPosition() {
        return position;
    }

    public void move(int distance) {
        if (distance < 0) {
            throw new IllegalArgumentException("Distance must be positive");
        }
        System.out.println("Train moving " + distance + " kilometers from current position: " + position);
        position += distance;
        updateObservers();
        System.out.println();
    }
}
