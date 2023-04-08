package MainPackage.collection;

import java.util.LinkedList;

public class LinkedListMethods {

    public static void main(String[] args) { //LINKED LIST IS BEST OPTION FOR INSERTING AND DELETION ON MIDDLE
        LinkedList al = new LinkedList();
        al.add(101);
        al.add("ABC");
        al.add(10.2f);
        al.add('g');
        al.add(50.5);
        al.add(101);
        al.add("ABC");
        al.add(null);
        al.add(null);



        al.addFirst("Sumit"); //    ADD FIRST
        al.add(4,"fourth"); //ADD ON FOURTH INDEX
        System.out.println(al.remove(1));//REMOVE FROM FROM 1 INDEX
        System.out.println(al.removeFirst()); //REMOVE FIRST
        System.out.println(al.removeLast()); //REMOVE LAST
        System.out.println(al.add(null));
        System.out.println(al.add(null));
        System.out.println(al.add(null));


        for (Object o:al)
            System.out.println(o);
}}
