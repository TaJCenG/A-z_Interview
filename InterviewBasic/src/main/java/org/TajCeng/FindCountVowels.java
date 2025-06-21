package org.TajCeng;

import java.util.Scanner;

public class FindCountVowels {
    public static  void main(String args[]){
        Scanner input = new Scanner( System.in );

        String forloop =  input.nextLine();
        int vowelsCount = 0;
        char[] ch = forloop.toLowerCase().toCharArray();

        for (char c : ch) {
            if ("aeiou".indexOf(c) != -1) {
                vowelsCount++;
                System.out.println(c);
            }
        }

        System.out.println("Vowels Count = " + vowelsCount);

        System.out.println();
        System.out.println("--------------------------------------------------------------");
        String name = input.nextLine();
        long count = name.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .peek(c -> System.out.println((char) c)) // prints each vowel
                .count();

        System.out.println("Vowels Count = " + count);



    }
}
