package com.company;

import java.util.Arrays;

public class Main {

    public static int[] insertSort(int array[]) {
        for(int i = 1; i < array.length; i++) {
            int j = i;
            int temp = array[j];
            while(j > 0 && array[j - 1] > temp) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] inputArray = new int[] {5, 3, -2, 9, 1};

        System.out.println(Arrays.toString(insertSort(inputArray)));
    }
}
