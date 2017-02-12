package com.bvan.start.lessons5_6.loop;

/**
 * @author bvanchuhov
 */
public class RangeSumCalculator {

    public static void main(String[] args) {
        int from = 1;
        int to = 5;

        int sum = 0;
        for (int n = from; n <= to; n++) {
            sum += n;
        }

        System.out.println("sum = " + sum);
    }
}
