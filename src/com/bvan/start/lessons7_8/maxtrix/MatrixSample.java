package com.bvan.start.lessons7_8.maxtrix;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class MatrixSample {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5},
                {7, 8, 9}
        };
        printMatrix(matrix);
        System.out.println();

        int elem = matrix[0][1];
        System.out.println("elem = " + elem);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            printArray(row);
        }
    }

    private static void printArray(int[] array) {
        for (int elem : array) {
            System.out.print(elem + "\t");
        }
        System.out.println();
    }
}
