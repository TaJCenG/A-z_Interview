package Top10StreamsJava8;

import java.util.Arrays;
import java.util.List;

public class SumOfList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        System.out.println(list.stream().reduce(0, (a,b)->a+b));

        System.out.println(list.stream().reduce(0, (Integer::sum)));
    }
}
