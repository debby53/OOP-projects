public class Arry1 {
    public static void main(String[] args) {
        int [] numbers={1,2,3,4,5};
        int mux= numbers[0];
        for(int num:numbers){
            if(num>mux){
                mux=num;

            }

        }
        System.out.println(mux);

    }
}
