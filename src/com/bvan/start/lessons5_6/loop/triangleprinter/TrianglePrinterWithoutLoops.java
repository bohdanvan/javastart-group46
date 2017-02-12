package com.bvan.start.lessons5_6.loop.triangleprinter;

/**
 * @author bvanchuhov
 */
public class TrianglePrinterWithoutLoops {

    public static void main(String[] args) {
        int size = 1000;

        // * (n = 1..1)
        System.out.print("*");
        System.out.println();

        // ** (n = 1..2)
        System.out.print("*");
        System.out.print("*");
        System.out.println();

        // *** (n = 1..3)
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.println();
    }
}
