package com.bvan.start.lessons5_6.loop;

/**
 * @author bvanchuhov
 */
public class DoWhileSample {

    public static void main(String[] args) {
        int from = 20;
        int to = 10;

        int n = from;

        // do-while
        do {
            System.out.println(n);
            n++;
        } while (n <= to);
    }
}
