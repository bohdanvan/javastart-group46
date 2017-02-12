package com.bvan.start.lessons5_6.loop;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class HelloPrinter {

    public static void main(String[] args) {
        // Input
        int from = 30;
        int to = 20;

        // BL
        for (int n = from; n <= to; n++) {
            System.out.println("Hello " + n);
        }
    }
}
