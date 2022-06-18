package iterator.example;


import java.util.Arrays;

public class PurchaseHistory implements Iterable {
    private final String name;
    private Purchase[] entries;

    public PurchaseHistory(String name) {
        if (name == null) {
            throw new IllegalArgumentException("name must not be null");
        }
        this.name = name;
        this.entries = new Purchase[0];
    }

    public String getName() {
        return name;
    }

    public void addPurchase(String item, int quantity) {
        if (item == null) {
            throw new IllegalArgumentException("item must not be null");
        }
        if (quantity < 0) {
            throw new IllegalArgumentException("quantity must not be negative");
        }
        entries = Arrays.copyOf(entries, entries.length + 1);
        entries[entries.length - 1] = new Purchase(item, quantity);
    }

    public Iterator iterator() {
        return new Iterator() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < entries.length;
            }

            @Override
            public Purchase next() {
                return entries[index++];
            }
        };
    }


    public static class Purchase {
        private final String item;
        private final int quantity;

        public Purchase(String item, int quantity) {
            if (item == null) {
                throw new IllegalArgumentException("item must not be null");
            }
            if (quantity <= 0) {
                throw new IllegalArgumentException("quantity must be positive");
            }
            this.item = item;
            this.quantity = quantity;
        }

        public String getItem() {
            return item;
        }

        public int getQuantity() {
            return quantity;
        }
    }
}
