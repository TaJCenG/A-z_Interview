package FunctioInterfStreAp;

import java.util.Arrays;
import java.util.List;

public class forEachLamb {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.forEach(System.out::println);//methodReference
        list.forEach( i ->System.out.println(i));
        list.forEach(forEachLamb::methodReference);
    }
    public static void methodReference(int i){
        System.out.println(i*2);
    }
}
