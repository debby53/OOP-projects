package loops;

public class Question2 {
    public static void main(String[] args) {
        int num=2;
        while (num <= 50) {
            boolean isPrime = true;
            int i = 2;
            while (i <= num / 2) {
                if (num % 2 == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if (isPrime) {
                System.out.print(num + " ");
            }

            num++;

        }
    }
    }
