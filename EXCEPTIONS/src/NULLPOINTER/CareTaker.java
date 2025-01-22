package NULLPOINTER;

public class CareTaker {
    public void careForAnimal(Animal animal) {
        // This will throw NullPointerException if 'animal' is null
        System.out.println("Caring for " + animal.getName() + " of age " + animal.getAge());
        animal.makeSound();
    }

    public void feedAnimal(AnimalBehavior behavior) {
        behavior.feed();
    }
}
