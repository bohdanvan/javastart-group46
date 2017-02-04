package com.bvan.start.lessons3_4.types.floating_point_types;

/**
 * @author bvanchuhov
 */
public class InfinitySample {

    public static void main(String[] args) {
        System.out.println(1.0 / 0); // Infinity
        System.out.println(-1.0 / 0); // -Infinity
        System.out.println(0.0 / 0); // NaN
    }
}
