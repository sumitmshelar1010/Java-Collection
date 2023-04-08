package MainPackage.collection;

import java.util.ArrayList;
import java.util.List;

public class GenericsListMethod {
    public static void main(String[] args) {
        List<String> lstObj = new ArrayList();
        //WE CAN USE HOMOGENEOUS DATA BY USING GENERIC CONCEPT
        lstObj.add("Sumit");
        lstObj.add("Mumbai");
        lstObj.add("Pune");
        lstObj.add("Nashik");
        lstObj.add("Nagpur");

        for (Object o : lstObj)
            System.out.println(o);
    }
}
