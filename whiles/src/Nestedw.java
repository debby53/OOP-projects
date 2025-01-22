public class Nestedw {
    public static void main(String[] args) {
        int i=1;

        while(i<=5){
            int j=1;
            while(j<=i){
                j++;
                System.out.print("*");
            }
            System.out.println();
            i++;
        }

    }
}
