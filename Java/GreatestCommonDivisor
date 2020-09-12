package com.company;

import java.util.Scanner;

public class Main {

    public static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return getGCD(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        System.out.print("Enter the first number: " );
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();

	    System.out.println("GCD of numbers "+a+" and "+b+" is: "+getGCD(a,b));
    }
}
