package MainPackage.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListByIterator {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add("Sumit");
        ar.add("pankaj");
        ar.add(1000);
        ar.add("Prachi");

        Iterator iterator = ar.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
