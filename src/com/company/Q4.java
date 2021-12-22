package com.company;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max1 = -1, max2 = -2, max3 = -3;
        int evens = 0, num=0;
        while (evens<6){
            System.out.println("enter number: ");
            num = scanner.nextInt();
            if(num%2 == 0)
                evens++;
            if (num > max1) {
                max3=max2;
                max2=max1;
                max1=num;
            }
            else if (num > max2) {
                max1=max2;
                max2=num;
            }
            else if (num > max3)
                max3 = num;

        }
        System.out.println("1st max= "+max1);
        System.out.println("2nd max= "+max2);
        System.out.println("3rd max= "+max3);

    }
}
