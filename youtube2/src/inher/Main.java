package inher;

public class Main {
    public static void main(String[] args) {
Calc c=new Calc();
AdvaCalc a=new AdvaCalc();
int v=a.div(5,7);
 int u=a.add(5,5);
int k=a.mult(6,60);
int p=a.div(10,2);
 int m=c.add(20,3);
 int n=c.sub(30,20);
        System.out.println(v);
        System.out.println(u);
        System.out.println(p);
        System.out.println(k);
        System.out.println("-------------------------------");
        System.out.println(m);
        System.out.println(n);
        System.out.println("_________________");

    }
}
