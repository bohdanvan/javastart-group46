package com.bvan.start.lessons3_4.types.floating_point_types;

/**
 * @author bvanchuhov
 */
public class MoneyStoring {

    public static void main(String[] args) {
        long money = 271613657;
        double moneyForOutput = (double) money / 10_000_000;

        System.out.println(moneyForOutput); // 27.1613657
    }
}
