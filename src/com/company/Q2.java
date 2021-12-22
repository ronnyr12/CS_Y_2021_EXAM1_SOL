package com.company;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double GOOD_WATER_AMOUNT = 3.1;
        double bad_days = 0 , today_amount= 0 , total_amount=0;
        double min = Double.MAX_VALUE, total_days = 0;

        while(today_amount < GOOD_WATER_AMOUNT){
            System.out.println("enter today amount: ");
            today_amount = scanner.nextDouble();
            total_amount += today_amount;
            total_days++;
            if(today_amount < GOOD_WATER_AMOUNT){
                bad_days++;
            }
            if(today_amount < min){
                min = today_amount;
            }
        }//endOf_while
        System.out.println("the minimal water amount is: "+min);
        System.out.println("total wrong water amount days:"+(bad_days-1));  //better with do while loop
        System.out.println("the average water amount is: "+(total_amount/total_days));


    }
}
