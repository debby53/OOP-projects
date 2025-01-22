package E_COMMERCE;

public class Bird extends Animal implements Movable{
    public Bird(String species, String habitat, String diet) {
        super(species, habitat, diet);
    }

    @Override
    public void makeSound() {
        System.out.println("swiiiiii");

    }

    @Override
    public void fly() {

    }

    @Override
    public void run() {

    }

    @Override
    public void swim() {

    }
}
