package com.bvan.start.lessons5_6.loop;

/**
 * @author bvanchuhov
 */
public class EvensHelloPrinter {

    public static void main(String[] args) {
        // Input
        int from = 1;
        int to = 10;

        // BL

        // Good
        if (from % 2 != 0) {
            from++;
        }
        for (int n = from; n <= to; n += 2) {
            System.out.println("Hello " + n);
        }

        // Bad (Code Duplication)
        if (from % 2 == 0) {
            for (int n = from; n <= to; n += 2) {
                System.out.println("Hello " + n);
            }
        } else {
            for (int n = from; n <= to; n += 2) {
                System.out.println("Hello " + (n + 1));
            }
        }

        // Bad (Lower performance)
        for (int n = from; n <= to; n++) {
            if (n % 2 == 0) {
                System.out.println("Hello " + n);
            }
        }
    }
}
