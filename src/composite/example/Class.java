package composite.example;

public class Class extends Type {
    private final int maxInstances;

    public Class(int maxInstances) {
        if (maxInstances < 0) {
            throw new IllegalArgumentException("maxInstances must be >= 0");
        }
        this.maxInstances = maxInstances;
    }

    @Override
    public int getMaxInstances() {
        return maxInstances;
    }
}
