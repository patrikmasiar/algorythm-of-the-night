package com.company;

public class Main {

    public static void getQuadraticEquationRoots(double a, double b, double c) {
        double x1, x2;
        double d =  (b * b) - (4 * a * c);

        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("==================");
            System.out.println("X1: " + x1);
            System.out.println("X2: " + x2);
        } else if (d == 0) {
            double root = -b / (2 * a);

            System.out.println("==================");
            System.out.println("X1,2: " + root);
        } else {
            double realPart = -b / (2 *a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a);

            System.out.println("==================");
            System.out.format("X1 = %.2f+%.2fi\nX2 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
        }
    }

    public static void main(String[] args) {
        getQuadraticEquationRoots(2, -11, 14);
        getQuadraticEquationRoots(1, 2, -63);
        getQuadraticEquationRoots(1, 3, 7);
    }
}
