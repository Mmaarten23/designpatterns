package factory.example;

public class DogBreeder extends Breeder {
    public Animal getBabyAnimal() {
        return new Dog();
    }
}
