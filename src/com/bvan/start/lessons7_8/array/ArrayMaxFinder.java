package com.bvan.start.lessons7_8.array;

/**
 * @author bvanchuhov
 */
public class ArrayMaxFinder {

    public static void main(String[] args) {
        System.out.println(max(new int[]{10, 20, 50, 30}));
        System.out.println(max(new int[]{10, 30, 0}));
    }

    public static int max(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("empty array");
        }

        int max = array[0];
        for (int elem : array) {
            if (max < elem) {
                max = elem;
            }
        }
        return max;
    }
}
