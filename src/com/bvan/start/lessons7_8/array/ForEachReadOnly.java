package com.bvan.start.lessons7_8.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ForEachReadOnly {

    public static void main(String[] args) {
        int[] array = new int[10];

        // for-each is READ ONLY!!!
        for (int elem : array) {
            elem = 1;
        }
        for (int i = 0; i < array.length; i++) {
            int elem = array[i];
            elem = 1;
        }

        System.out.println(Arrays.toString(array));
    }
}
