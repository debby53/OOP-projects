package LIBRARY_MANAGEMNET;

public class Book extends LibraryMaterial{
    public  String author;

    public Book(String title, int itemId, boolean isAvailable) {
        super(title, itemId, isAvailable);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("the author is "+author);
    }
}
