public class Student {

        int stdId;
        String name;
        int age;

    static String address;
    static {
        address="kigali";
    }

    public void studentInformation() {
        System.out.println(stdId + name + age);
    }
        public static void getInfo(){
            System.out.println("inside a static method");

    }
}
