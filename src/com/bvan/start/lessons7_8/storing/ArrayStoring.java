package com.bvan.start.lessons7_8.storing;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayStoring {

    public static void main(String[] args) {
        int[] a1 = {10, 20, 30};
        int[] a2 = a1; // reference copy

        a2[0] = 1000;

        System.out.println("a1 = " + Arrays.toString(a1)); // [1000, 20, 30]
        System.out.println("a2 = " + Arrays.toString(a2)); // [1000, 20, 30]

        System.out.println(a1 == a2); // true
        System.out.println(Arrays.equals(a1, a2)); // true
        System.out.println();

        //-----------------------

        int[] b1 = {10, 20, 30};
        int[] b2 = Arrays.copyOf(a1, a1.length); // content copy

        b2[0] = 1000;

        System.out.println("b1 = " + Arrays.toString(b1)); // [10, 20, 30]
        System.out.println("b2 = " + Arrays.toString(b2)); // [1000, 20, 30]

        System.out.println(b1 == b2); // false
        System.out.println(Arrays.equals(b1, b2)); // false
    }
}
