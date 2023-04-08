package MainPackage.collection;

import java.util.HashSet;

public class HashSetMethod {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("Mumbai");        //HETEROGENEOUS OBJECTS ARE ALLOWED
        hs.add(1000);            //DUPLICATES ARE NOT ALLOWED
        hs.add("Jalgaon");       //INSERTION ORDER IS NOT PRESERVED
        hs.add("Mumbai");        //NULL INSERTION IS POSSIBLE ONLY ONCE
        hs.add(null);            //BEST IF FREQUENT OPERATION IS "SEARCH"
        hs.add(null);            /* WE CAN MENTION DUPLICATES, WON'T GET ANY COMPILATION & RUNTIME
                                    ERROR BUT THAT PRINTED ONLY ONCE */
      /* System.out.println(hs.add(null));
       System.out.println(hs.add("Mumbai"));
        System.out.println(hs.contains("Mumbai"));
        System.out.println(hs.remove(1000));
        System.out.println(hs.clone());
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());*/
        System.out.println(hs.add("Mumbai"));// for duplicate value it will print false only



        for (Object o : hs)
            System.out.println(o);
    }
}
