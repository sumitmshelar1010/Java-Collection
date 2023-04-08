package MainPackage.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetMethod {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("Mumbai");
        lhs.add("Mumbai");      //HETEROGENEOUS OBJECTS ARE ALLOWED
        lhs.add("Pune");        //INSERTION ORDER IS PRESERVED
        lhs.add(100);           //NULL INSERTION IS POSSIBLE ONLY ONCE
        lhs.add(10.5f);         //BEST IF FREQUENT OPERATION IS "SEARCH"
        lhs.add(null);          //DUPLICATES ARE NOT ALLOWED
        lhs.add(null);          /* WE CAN MENTION DUPLICATES, WON'T GET ANY COMPILATION & RUNTIME
                                    ERROR BUT THAT PRINTED ONLY ONCE */

        System.out.println(lhs.add(500));
        System.out.println(lhs.add(500));
        System.out.println(lhs.size());
        System.out.println(lhs.remove("Pune"));
        System.out.println(lhs.clone());
        System.out.println(lhs.contains("Mumbai"));
        for (Object o: lhs)
            System.out.println(o);
    }
}
