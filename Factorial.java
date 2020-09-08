package com.company; 

import java.util.Scanner;

public class Main {

    public static long factorialBasic(int x) {
        long fact = 1;
        for (int i = 2; i <= x; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static long factorialRecursive(int x) {
        if (x == 0) {
            return 1;
        } else {
            return x * factorialRecursive(x - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        System.out.print( "Enter the number: " );
        int a = input.nextInt();

        System.out.println("Basic factorial of number "+a+" is "+factorialBasic(a));
	    System.out.println("Recursion Factorial of number "+a+" is "+factorialRecursive(a));
    }
}
