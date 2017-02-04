package com.bvan.start.lessons3_4.scanner;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class HelloIOSample {

    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        // BL
        String message = "Hello, " + name + ", " + age + " years old";

        // Output
        System.out.println(message);
    }
}
