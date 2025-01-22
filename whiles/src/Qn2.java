public class Qn2 {
    public static void main(String[] args) {
        int i;
        int num = 2;
        int isPrime = 1;
        while (num <= 50) {
            isPrime = 1;


            for (i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = 0;
                    break;

                }
            }
            if (isPrime == 0) {
                System.out.println(num);
            }
            num++;
        }
    }

}
