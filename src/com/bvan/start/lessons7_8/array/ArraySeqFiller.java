package com.bvan.start.lessons7_8.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArraySeqFiller {

    public static void main(String[] args) {
        int[] array = new int[10];
        seqFill(array);
        System.out.println(Arrays.toString(array));
    }

    public static void seqFill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }
}
