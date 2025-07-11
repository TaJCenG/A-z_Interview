package Top10StreamsJava8;

import java.util.Arrays;
import java.util.List;

public class countGreaterThan {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,7,9,11,15,3,16,234,123,314,-1111);

        //give the length
        System.out.println(list.stream().filter(n ->n>9).count());

        // Return the list
        System.out.println(list.stream().filter(n ->n>9).toList());
    }
}
