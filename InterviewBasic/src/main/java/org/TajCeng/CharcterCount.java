package org.TajCeng;

import java.util.Scanner;

public class CharcterCount
{
    public static void main(String[] args)
    {
        Scanner chara = new Scanner( System.in );

        System.out.println( "Basic For loop");
        String name = chara.nextLine();
        int count = 0;
        for(int i =0; i<name.length(); i++){
            if(name.charAt(i) !=' '){
                count++;
            }
        }System.out.println(count);

        System.out.println( "Using 8+");
        String secondString = chara.nextLine();
        long counting = secondString.chars().filter( sc -> sc != ' ').count();
        System.out.println( "Using 8+ The Count Value is " + counting);


        System.out.println( "Using Regular Expressions");
        String thirdString = chara.nextLine();
        int countThirdString = thirdString.replaceAll(" ", "").length();
        System.out.println( "Using Regular Expressions "  + countThirdString );

        System.out.println( "Using String Transform");
        String fourthString = chara.nextLine();
        long countFourthString = fourthString.transform(f -> f.chars().filter( c -> c != ' ').count());
        System.out.println( "Using Transform "  + countFourthString );

    }
}
