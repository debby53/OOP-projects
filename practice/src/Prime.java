public class Prime {
    public static void main(String[] args) {


        int num;
        int i;
        int isPrime = 1;
        for (num = 2; num <= 50; num++) {
            isPrime = 1;
            for (i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = 0;
                }
            }
            if (isPrime==1) {
                System.out.println(num);
            }
        }
    }
}
