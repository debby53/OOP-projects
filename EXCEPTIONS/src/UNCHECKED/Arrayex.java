package UNCHECKED;

public class Arrayex {
    public static void main(String[] args) {
        int[]product={10,20,40,50};
        try {
            System.out.println("the index at index 3 is "+ product[3]);
            System.out.println("Product 5 quantity: " + product[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
