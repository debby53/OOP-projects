package Library;

public abstract class DVD extends LibraryMaterial{
    @Override
    public boolean checkAvailability() {
        return false;
    }
}
