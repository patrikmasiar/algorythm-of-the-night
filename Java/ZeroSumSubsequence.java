package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static boolean isZeroSumSubsequenceInArray(int array[]) {
        int sum = 0;
        Set<Integer> hs = new HashSet<Integer>();

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (sum == 0 || hs.contains(sum) || array[i] == 0) {
                return true;
            }

            hs.add(sum);
        }

        return false;
    }

    public static void main(String[] args) {
	    int arrayWith[] = {2, 8, -9, 1};
	    int arrayWithout[] = {1, 2, -9, 8};

	    System.out.println("Array with: "+isZeroSumSubsequenceInArray(arrayWith));
	    System.out.println("Array without: "+isZeroSumSubsequenceInArray(arrayWithout));
    }
}
