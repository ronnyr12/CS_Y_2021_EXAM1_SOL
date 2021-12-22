package com.company;

public class Q1 {

    public static void main(String[] args) {
        int temp, x = 3, y = 7;

        //q1 - starts here...
	    y = x + y;
        x = y - x;
        y = y - x;
        System.out.println("x=" + x +" y = "+ y );
        if(x >= y){
            temp = x;
            x = y;
            y = temp;
            System.out.println("x=" + x +" y = "+ y );
        }
    }
}
