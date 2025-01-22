package LIBRARY_MANAGEMNET;

public abstract class LibraryMaterial implements LibraryItem{
    private String title;
    private int itemId;
    private boolean isAvailable;


    public LibraryMaterial(String title, int itemId, boolean isAvailable) {
        this.title = title;
        this.itemId = itemId;
        this.isAvailable = isAvailable;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    public void displayDetails(){
        System.out.println("title: "+title);
        System.out.println("item id: "+itemId);
        System.out.println("availability "+(isAvailable ? "available":"not available"));
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }

    @Override
    public int getItemId() {
        return itemId;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
