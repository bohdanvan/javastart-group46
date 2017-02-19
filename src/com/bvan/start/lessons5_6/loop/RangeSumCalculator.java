package com.bvan.start.lessons5_6.loop;

/**
 * @author bvanchuhov
 */
public class RangeSumCalculator {

    public static void main(String[] args) {
        int from = 1;
        int to = 5;

        int sum = sum(from, to);

        System.out.println("sum = " + sum);
    }

    private static int sum(int from, int to) {
        int sum = 0;
        for (int n = from; n <= to; n++) {
            sum += n;
        }
        return sum;
    }
}
