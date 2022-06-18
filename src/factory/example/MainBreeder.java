package factory.example;

public class MainBreeder {
    public static void main(String[] args) {
        pet(new CatBreeder());
        pet(new DogBreeder());
    }

    public static void pet(Breeder breeder) {
        breeder.getBabyAnimal().pet();
    }
}
