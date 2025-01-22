package Library;

public abstract   class Book extends LibraryMaterial{


    @Override
    public boolean checkAvailability() {
        return false;
    }
}
