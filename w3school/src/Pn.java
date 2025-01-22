import java.util.Scanner;
public class Pn {
    public static void main(String[] args) {
        int i = 2;
        int num = 2;
        int isPrime = 1;
        while (i <= 50) {
            isPrime = 1;


            while (i <= num / 2) {
                if (num % i == 0) {
                    isPrime = 0;
                    break;
                }
                i++;
            }

            if (isPrime == 1) {
                System.out.println(num);

            }
            num++;

        }

    }
}