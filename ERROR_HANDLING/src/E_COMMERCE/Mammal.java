package E_COMMERCE;

public abstract class Mammal extends Animal implements Movable{
    public Mammal(String species, String habitat, String diet) {
        super(species, habitat, diet);
    }

    @Override
    public void makeSound() {

    }



    @Override
    public void run() {

    }

    @Override
    public void swim() {

    }
}
