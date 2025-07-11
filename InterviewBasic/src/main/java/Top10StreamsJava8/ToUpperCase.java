package Top10StreamsJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {
    public static void main(String[] args) {
        List<String> upper = Arrays.asList("Taj", "aseraf","addu");
        System.out.println(upper.stream().map(String::toUpperCase).collect(Collectors.toList()));
    }
}
