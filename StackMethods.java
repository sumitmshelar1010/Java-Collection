package MainPackage.collection;

import java.util.Stack;

public class StackMethods {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push("Mumbai");
        st.push(100);
       st.push(10.5f);
        st.push(10.67);
        st.push('d');
        st.push(10.67);
        st.push(10.5f);
        //System.out.println(st.empty());
        //System.out.println(st.peek());
       System.out.println(st.pop());
        System.out.println(st.push(100));
        System.out.println(st.size());

        for (Object o: st)
            System.out.println(o);
    }
}
