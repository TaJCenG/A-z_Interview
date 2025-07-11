package Top10StreamsJava8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingAscending {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,7,9,11,15,3,16,234,123,314,-1111);

        System.out.println(list.stream().sorted().collect(Collectors.toList()));
    }
}
