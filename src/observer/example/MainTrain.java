package observer.example;

public class MainTrain {
    public static void main(String[] args) {
        Train train = new Train();
        train.addObserver(new CrossRoad("CrossRoad1", 10));
        train.addObserver(new TrainStation("Kings Cross", 15));
        train.addObserver(new CrossRoad("CrossRoad2", 20));
        train.move(10);
        train.move(5);
        train.move(8);
        train.move(7);
    }
}
