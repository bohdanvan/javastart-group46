package com.bvan.start.lessons5_6.loop;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class SumGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        int n;
        do  {
            System.out.print(">> ");
            n = scanner.nextInt();

            sum += n;
        } while (n != 0);

        System.out.println("sumWithoutForeach = " + sum);
    }
}
