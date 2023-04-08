package MainPackage.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethods { //MAP INTERFACE IMPLEMENTED BY HASH MAP CLASS
    public static void main(String[] args) {//HASH MAP MAINLY USE FOR INDEXING AND SEARCH
      HashMap<Integer, String> mp = new HashMap<Integer, String>();
      mp.put(1,"Jalgaon");
      mp.put(2,"Mumbai");
      mp.put(4,"Pune");
      mp.put(3,"Nagpur");
      mp.put(5,"Nashik");
      mp.put(1,"Sangali"); //IF KEY IS ALREADY PRESENT THEN OLD VALUE WILL REPLACED WITH NEW VALUE

        mp.put(0,"");
        mp.put(6,null);
        mp.put(7,null);
       mp.put(null,null);
       mp.put(null,null);
      mp.put(null,"Sumit");

       /* System.out.println(mp.containsKey(2));
        System.out.println(mp.getOrDefault(5,""));
        System.out.println(mp.remove(4));
        System.out.println(mp.get(1));
        System.out.println(mp.replace(3,"Dhule"));*/

       System.out.println(mp.put(1,"Sangali"));
      System.out.println(mp.put(3,"Nagpur"));/*If we try enter duplicate key and value so it will
      only show the value*/

        for (Map.Entry me :mp.entrySet())
            System.out.println(me.getKey()+ " "+me.getValue());
    }
}
