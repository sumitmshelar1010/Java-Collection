package MainPackage.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMethod {
    public static void main(String[] args) {
        SortedSet ss = new TreeSet(); //MAINLY USED FOR SORTING OPERATIONS
            ss.add("Mumbai");
            //ss.add(100);        //HETEROGENEOUS DATA IS NOT ALLOWED Shows ClassCastException
            ss.add("Pune");              //INSERTION ORDER IS NOT PRESERVED
            ss.add("jalgaon");
            ss.add("Nashik");
            ss.add("Mumbai");
      /** IF WE TRY DUPLICATION OF OBJECT WE WON'T GET COMPILE AND RUN TIME ERROR  */
            //ss.add(null);    //NULL INSERTION IS NOT ALLOWED, i shows null pointer exception
        System.out.println(ss.size());
        System.out.println(ss.add("Nagpur"));
        System.out.println(ss.add("Mumbai"));
        for (Object o:ss)
            System.out.println(o);
    }
}

