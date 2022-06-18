package observer.example;

public class CrossRoad implements TrainObserver {
    private final String name;
    private final int position;
    private boolean closed;

    public CrossRoad(String name, int position) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name cannot be null or empty");
        }
        if (position < 0) {
            throw new IllegalArgumentException("position cannot be negative");
        }
        this.name = name;
        this.position = position;
        this.closed = false;
    }

    @Override
    public void update(Train train) {
        if (!closed && Math.abs(position - train.getPosition()) <= 3) {
            this.closed = true;
            System.out.println("CrossRoad " + name + " is closed");
            return;
        }
        if (closed) {
            this.closed = false;
            System.out.println("CrossRoad " + name + " is opened");
        }
    }
}
