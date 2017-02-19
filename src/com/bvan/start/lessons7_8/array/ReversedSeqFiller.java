package com.bvan.start.lessons7_8.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ReversedSeqFiller {

    public static void main(String[] args) {
        int[] array = new int[10];
        reversedSeqFill(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reversedSeqFill(int[] array) {
        int filler = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
            filler--;
        }
    }
}
