package iterator.example;

public interface Iterator {
    boolean hasNext();

    PurchaseHistory.Purchase next();
}
