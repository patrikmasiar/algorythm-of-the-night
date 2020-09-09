package com.company;

public class Main {

    public static void includes(int [] array, int x, int left, int right) {
        if (left > right) {
            System.out.println("Not Includes");
        }

        if (array[left] == x) {
            System.out.println("Includes");
        } else {
            includes(array, x, left+1, right);
        }
    }

    public static void main(String[] args) {
	    int array[] = {1,3,5,8};
        // Includes
        includes(array, 5, 0, array.length - 1);
        // Not includes
        includes(array, 7, 0, array.length - 1);
    }
}
