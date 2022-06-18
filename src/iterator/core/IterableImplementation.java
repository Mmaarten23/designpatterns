package iterator.core;


public class IterableImplementation implements Iterable<Object> {

    @Override
    public Iterator<Object> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                // ...
                return false;
            }

            @Override
            public Object next() {
                // ...
                return null;
            }
        };
    }
}
