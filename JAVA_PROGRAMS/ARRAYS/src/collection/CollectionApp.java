package collection;

import java.util.*;

public class CollectionApp {
    public static void main(String[] args) {
//        Collection c1=new HashSet();
//        c1.add("tom");
//        c1.add("60");
//        c1.add("70");
//        System.out.println(c1);

//        Set<Integer> c1=new HashSet<>();
//        c1.add(50);
//        c1.add(20);
//        c1.add(40);
//        c1.add(9);
//
//        Set<Integer> c2=new HashSet<>(Arrays.asList(50,9,11,7));
//        union
//       Set<Integer> c3=new HashSet<>(c1);
//        System.out.println(c3);
//        c3.addAll(c2);
//        System.out.println(c3);

// intersection

//      Set<Integer>c4=new HashSet<>(c1);
//        c4.retainAll(c2);
//        System.out.println(c4);

//        Set<Integer>s5=new HashSet<>(c1);
//        System.out.println(s5);
//        s5.removeAll(c2);
//        System.out.println(s5);
        double product=1.1;

        Set<Double> s1=new TreeSet<>();
        double sum=0.0;
        s1.add(10.0);
        s1.add(40.0);
//        System.out.println(s1);

//        iterating though set elements
//        1.for each loop
        for(double m :s1){
            sum+=m;
            System.out.println("the sum is "+sum);
        }
//        2.using iterator()method
        Iterator<Double>itr=s1.iterator();
//        System.out.println(itr.next());
        while (itr.hasNext()){
//            System.out.println(itr.next());
            product *=itr.next();
        }
        System.out.println("product"+product);




//        Set<String> c1=new HashSet<>();
//        c1.add("tom");
//
//        c1.add("tom");
//        c1.add("60");
//        c1.add("70");
//        System.out.println(c1);

//        List l1=new ArrayList();
//        l1.add("tom");
//        l1.add("60");
//        l1.add("70");
//        System.out.println(l1);
    }
}
