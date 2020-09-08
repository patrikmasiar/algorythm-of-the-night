package com.company;

import java.util.Scanner;

public class Main {

    public static long fibonacciSeriesRecursive(int x) {
        if (x < 2) {
            return x;
        } else {
            return fibonacciSeriesRecursive(x-1) + fibonacciSeriesRecursive(x-2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        System.out.print( "Enter the number: " );
        int a = input.nextInt();

        System.out.println("Recursion Fibonacci series of number "+a+" is "+fibonacciSeriesRecursive(a));
    }
}
