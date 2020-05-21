package exercitii;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        AnimalPig pig = new AnimalPig();
        AnimalDog dog = new AnimalDog();

        animal.animalSound();
        pig.animalSound();
        dog.animalSound();


    }
}
