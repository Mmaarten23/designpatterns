package observer.example;

public class TrainStation implements TrainObserver {
    private final String name;
    private final int position;

    public TrainStation(String name, int position) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name cannot be null or empty");
        }
        if (position < 0) {
            throw new IllegalArgumentException("position cannot be negative");
        }
        this.name = name;
        this.position = position;
    }

    @Override
    public void update(Train train) {
        if (train.getPosition() == position) {
            System.out.println("train arrived at " + name);
        }
    }
}
