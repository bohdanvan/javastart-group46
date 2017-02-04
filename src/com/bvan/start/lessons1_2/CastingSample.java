package com.bvan.start.lessons1_2;

/**
 * @author bvanchuhov
 */
public class CastingSample {

    public static void main(String[] args) {
        long x = 3000000000L;
        int y = (int)x;

        System.out.println(y); // -1294967296 (bad casting)
    }
}
