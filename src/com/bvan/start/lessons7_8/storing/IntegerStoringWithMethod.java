package com.bvan.start.lessons7_8.storing;

/**
 * @author bvanchuhov
 */
public class IntegerStoringWithMethod {

    public static void main(String[] args) {
        int x = 10;
        x = inc(x);
        System.out.println("x = " + x); // 11
    }

    private static int inc(int a) {
        return a + 1;
    }
}
