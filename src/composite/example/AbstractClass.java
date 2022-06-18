package composite.example;

import java.util.ArrayList;
import java.util.List;

public class AbstractClass extends Type {
    private final List<Type> subTypes;

    public AbstractClass() {
        subTypes = new ArrayList<>();
    }

    public void addSubType(Type type) {
        if (type == null) {
            throw new IllegalArgumentException("type cannot be null");
        }
        if (subTypes.contains(type)) {
            throw new IllegalArgumentException("type already exists");
        }
        subTypes.add(type);
    }

    @Override
    public int getMaxInstances() {
        return subTypes.stream().mapToInt(Type::getMaxInstances).sum();
    }
}
