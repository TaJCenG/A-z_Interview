package Top10StreamsJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxValue {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,4,7,9,11,15,3,16,234,123,314,-1111);

        //Optional<Integer> maxList = list.stream().max(Integer::compare);
        System.out.println(list.stream().max(Integer::compare));
    }
}
