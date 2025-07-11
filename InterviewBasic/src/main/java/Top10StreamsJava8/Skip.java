package Top10StreamsJava8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Skip {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,4,1,4,7,9,11,15,3,16,2,3);

        System.out.println(list.stream().distinct().skip(2).sorted().collect(Collectors.toList()));

        //8 problem List to SET
        Set<Integer> set = list.stream().collect(Collectors.toSet());
        System.out.println(set);
    }
}
