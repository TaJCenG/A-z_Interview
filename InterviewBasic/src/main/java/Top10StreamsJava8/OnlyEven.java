package Top10StreamsJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class OnlyEven {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6,7,8,9,11,15,16,234,123,314);

       List<Integer> evenList = list.stream().filter( i -> i%2==0).collect(Collectors.toList());
        System.out.println(list.stream().filter( i -> i%2==0).collect(Collectors.toList()));

        //list.forEach(OnlyEven::methodReference); //returns true or false
    }
    public static void methodReference(int i){
        System.out.println(i%2==0);
    }
}
