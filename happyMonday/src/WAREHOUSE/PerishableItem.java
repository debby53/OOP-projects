package WAREHOUSE;

public class PerishableItem extends Item{
    @Override
    public double calculateStorageSpace() {
        return super.calculateStorageSpace()*1.2;
    }
}
