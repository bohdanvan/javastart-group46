package com.bvan.start.lessons5_6.loop.triangleprinter;

/**
 * @author bvanchuhov
 */
public class TrianglePrinterWithPartialLoop {

    public static void main(String[] args) {
        int size = 1000;

        // * (n = 1..1), row = 1
        for (int n = 1; n <= 1; n++) {
            System.out.print("*");
        }
        System.out.println();

        // ** (n = 1..2), row = 2
        for (int n = 1; n <= 2; n++) {
            System.out.print("*");
        }
        System.out.println();

        // *** (n = 1..3), row = 3
        for (int n = 1; n <= 3; n++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
