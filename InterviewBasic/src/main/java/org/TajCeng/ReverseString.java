package org.TajCeng;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println( "Reverse the string with 8+");
        String original = input.nextLine();
        String reversed = original.transform( o -> new StringBuilder(o).reverse().toString());
        System.out.println(reversed);


        System.out.println( "Reverse the string with Logic");
        String name = input.nextLine();
        String Reversed = "";
        for(int i=name.length()-1; i>=0; i--){
            Reversed += name.charAt(i);
        }
        System.out.println(Reversed);


        System.out.println( "Reverse the string with inbuilt methods");
        String a = input.nextLine();
        StringBuffer sb = new StringBuffer(a);
        StringBuffer reverse = new StringBuffer(sb.reverse().toString());
        System.out.println(reverse);
    }

}
