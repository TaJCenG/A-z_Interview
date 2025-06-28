package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Itera {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add("Taj");
        a.add(5);
        System.out.println(a);

        Iterator it = a.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
