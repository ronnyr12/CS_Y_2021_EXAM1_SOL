package com.company;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        //this solution uses a for loop, an alternative solution is to declare 4 char variables
        Scanner s = new Scanner(System.in);
        final int TIMES = 4;
        //can be initialized also with other values, \u0000 is the default value of char
        char tav1 = '\u0000', tav2 = '\u0000', tav3 = '\u0000', tav4 = '\u0000';
        System.out.println("enter shift value: ");
        int shift = s.nextInt();
        System.out.println("enter only capital letters!");

        //solution option1 => a to z without round shifting
        System.out.println("enter the 1st letters: ");
        tav1 = s.next().charAt(0);
        System.out.println("enter the 2nd letters: ");
        tav2 = s.next().charAt(0);
        System.out.println("enter the 3rd letters: ");
        tav3 = s.next().charAt(0);
        System.out.println("enter the 4th letters: ");
        tav4 = s.next().charAt(0);

        char nwTav1 = (char)(tav1 + shift);
        char nwTav2 = (char)(tav2 + shift);
        char nwTav3 = (char)(tav3 + shift);
        char nwTav4 = (char)(tav4 + shift);
        System.out.println(""+nwTav1+ nwTav2 + nwTav3 + nwTav4);
        /**
         * solution option2 - round shifting

         if ((int) (tav1 + shift) > 90)
            tav1 = (char) (65 + ((tav1 + shift) - 90));
         else
            tav = (char) (tav + shift);
         //for all 4 variables
         System.out.print(tav);
         **/

    }
}
