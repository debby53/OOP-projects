package LIBRARY_MANAGEMNET;

public class DVD extends LibraryMaterial{
    private int duration;

    public DVD(String title, int itemId, boolean isAvailable, int duration) {
        super(title, itemId, isAvailable);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("the duration is "+duration);
    }
}
