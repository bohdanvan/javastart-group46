package com.bvan.start.lessons7_8.array;

/**
 * @author bvanchuhov
 */
public class ArraySumCalculator {

    public static void main(String[] args) {
        System.out.println(sumWithoutForeach(new int[]{10, 20, 50, 30}));
        System.out.println(sumWithoutForeach(new int[]{}));

        System.out.println(sum(new int[]{10, 20, 50, 30}));
        System.out.println(sum(new int[]{}));
    }

    public static int sumWithoutForeach(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int elem = array[i];
            sum += elem;
        }
        return sum;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum;
    }
}
