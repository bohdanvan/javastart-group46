package com.bvan.start.lessons7_8.storing;

/**
 * @author bvanchuhov
 */
public class IntegerStoring {

    public static void main(String[] args) {
        int x = 10;
        int y = x;

        y++;

        System.out.println("x = " + x); // 10
        System.out.println("y = " + y); // 11
    }
}
