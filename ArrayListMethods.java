package MainPackage.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList a = new ArrayList(); //Upcasting
        a.add("Sumit");
        a.add(102);
        a.add('b');
        a.add(100.5f);
        a.add(15.5);
        a.add(null);
        a.add("Sumit");
        a.add(102);
        a.add(1,500);
        a.add(null);
       /* System.out.println(a.get(5));
        System.out.println(a.get(2));//get the data of specific index
        System.out.println(a.size());
        a.remove("Sumit");
        a.remove(2);
        System.out.println(a.add(555));


       // a.clear();*/

     //Collections.sort(a);
       Collections.addAll(a, 10000 , "Sumit");

        for (Object o : a) {
            System.out.println(o);
        }}}
