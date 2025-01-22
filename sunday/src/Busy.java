public class Busy {
    int width;
    int height;

    public Busy(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public Busy(Busy b){
      this.width= b.width;
      this.height=b.height;

    }
    public boolean isEqual(Busy b){
        if(this.width== b.width && this.height==this.height)
            return true;
        else
            return false;
    }
    public void display(){
        System.out.println("width is "+width + " and height is "+height);

    }
    public static boolean isTwoObjectsEqual(Busy b1,Busy b2){
        if(b1.width== b2.width && b2.height== b1.height)
            return true;
        else
           return false;
    }
    Busy duplicate(){
        Busy temp=new Busy(this.height ,this.height);
        return temp;

    }


    public static void main(String[] args) {
        Busy b1=new Busy(10,20);
        Busy b2=new Busy(40,50);
        Busy b3=new Busy(b1);
        Busy b4=b2.duplicate();
        if(b1.isEqual(b2)){
            System.out.println("b1 and b2 are equal");
        }else {
            System.out.println("b1 and b2 are not  equal");
        }
        b3.display();
        b1.display();
        b4.display();
        b2.display();
        if(Busy.isTwoObjectsEqual(b1,b2)){
            System.out.println("b1 and b2 are equal");
        }else {
            System.out.println("b1 and b2 are not  equal");
        }

    }
}
