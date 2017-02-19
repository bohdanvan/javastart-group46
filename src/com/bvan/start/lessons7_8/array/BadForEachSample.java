package com.bvan.start.lessons7_8.array;

/**
 * @author bvanchuhov
 */
public class BadForEachSample {

    public static void main(String[] args) {
        int[] array = {10, 20, 30};

        for (int i : array) { // SHOULD BE: int elem : array
            System.out.println(array[i]);
        }
    }
}
