package MainPackage.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableMethod {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(1,"Mumbai");
        ht.put(4,"Pune ");
        ht.put(2,"Jalgaon");
        ht.put(3,"Dhule");
        ht.put(5,"Nashik");
        ht.put(5,"Nashik");
       //ht.put(6,null);  //We will get NullPointerException
        System.out.println(ht.put(3,"Dhule")); /*If we add duplicate key and value it
        will give value only*/

        for(Map.Entry m:ht.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());

        }
}}
