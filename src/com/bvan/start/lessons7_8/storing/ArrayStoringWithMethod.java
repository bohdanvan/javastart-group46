package com.bvan.start.lessons7_8.storing;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayStoringWithMethod {

    public static void main(String[] args) {
        int[] a1 = new int[3];
        fill(a1, 10);
        System.out.println(Arrays.toString(a1));

        int[] a2 = createArrayWithOne();
        System.out.println(Arrays.toString(a2));
    }

    public static int[] createArrayWithOne() {
        return new int[] {1};
    }

    private static void fill(int[] array, int filler) {
        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
        }
    }
}
