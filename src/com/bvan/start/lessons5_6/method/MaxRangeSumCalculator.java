package com.bvan.start.lessons5_6.method;

/**
 * @author bvanchuhov
 */
public class MaxRangeSumCalculator {

    // Client
    public static void main(String[] args) {
        int sum1 = rangeSum(100, 200) + rangeSum(250, 300);
        int sum2 = rangeSum(400, 500);
        int res = min(sum1, sum2);

        System.out.println("res = " + res);
    }

    // Creator
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Creator
    public static int min(int a, int b) {
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }

    // Creator
    public static int rangeSum(int from, int to) {
        int sum = 0;
        for (int n = from; n <= to; n++) {
            sum += n;
        }
        return sum;
    }

    // Creator
    public static int rangeSum(int to) {
        return rangeSum(1, to);
    }
}
