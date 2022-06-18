package iterator.example;

public class MainPurchase {
    public static void main(String[] args) {
        PurchaseHistory history = new PurchaseHistory("username");
        history.addPurchase("item1", 10);
        history.addPurchase("item2", 20);
        history.addPurchase("item3", 30);
        Iterator iterator = history.iterator();
        while (iterator.hasNext()) {
            PurchaseHistory.Purchase purchase = iterator.next();
            System.out.printf("%s: %d%n", purchase.getItem(), purchase.getQuantity());
        }
    }
}
