package WAREHOUSE;

public class FragileItem  extends Item{
    @Override
    public double calculateStorageSpace() {
        return super.calculateStorageSpace()*1.2;
    }
}
