package org.TajCeng;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FindDuplicates
{
    public static void  main( String[] args )
    {
        Scanner input = new Scanner( System.in );

        String name = input.nextLine();
        for( int i =0; i<name.length(); i++){
            for( int j =i+1; j<name.length(); j++){
                if(name.charAt(i)==name.charAt(j)){
                    System.out.print("For Loop " +name.charAt(j));
                }
            }
        }

        System.out.println("---------------------------------------------------------------------- ");
        System.out.print("\n java 8+ ");
        String java8 = input.nextLine();
                        java8.chars()
                                .mapToObj(c -> (char)c).
                                collect(Collectors.groupingBy(c -> c,Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue()>1).
                forEach(e -> System.out.println(e.getKey() +" : " + e.getValue()));

        System.out.println("---------------------------------------------------------------------- ");
        int[] array = {1,2,3,4,3,4,5,2,1};
        Arrays.stream(array).boxed().
                collect(Collectors.groupingBy(a -> a, Collectors.counting())).entrySet().stream().filter(
                        e -> e.getValue()>1).forEach(
                                e -> System.out.println(e.getKey() +" : " + e.getValue())
                );
        System.out.println("---------------------------------------------------------------------- ");
        int target = 4;
        long count = Arrays.stream(array).filter(n -> n == target).count();
        System.out.println(target + " appears " + count + " times");

    }
}
