package inher;

public class Calc implements A,B {
    @Override
    public void show() {

    }

    @Override
    public void config() {

    }

    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }


}
