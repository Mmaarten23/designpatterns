package factory.example;

public class CatBreeder extends Breeder {
    public Animal getBabyAnimal() {
        return new Cat();
    }
}
