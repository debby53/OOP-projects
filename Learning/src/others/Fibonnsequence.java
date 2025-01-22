package others;

public class Fibonnsequence {
    public static void main(String[] args) {
        int i;
        int num1=0;
        int num2=1;
        for(i=1; i<=10; i++ ){
            System.out.println(num1);
            int nextNum=num1+num2;
          num1=num2;
          num2=nextNum;
        }
    }
}
