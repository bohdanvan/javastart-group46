package com.bvan.start.lessons5_6.loop.triangleprinter;

/**
 * @author bvanchuhov
 */
public class TrianglePrinter {

    public static void main(String[] args) {
        int size = 10;

        // Print Triangle
        for (int row = 1; row <= size; row++) {

            // Print Row
            for (int n = 1; n <= row; n++) {
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
