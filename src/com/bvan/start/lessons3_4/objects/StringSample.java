package com.bvan.start.lessons3_4.objects;

/**
 * @author bvanchuhov
 */
public class StringSample {

    public static void main(String[] args) {
        String s = "Hellololo, world!";

        int length = s.length();
        System.out.println("length = " + length);

        char c = s.charAt(1);
        System.out.println("c = " + c);

        int lastIndex = s.length() - 1;
        char lastChar = s.charAt(lastIndex);
        System.out.println("lastChar = " + lastChar);

        int indexOfLo = s.indexOf("lo");
        System.out.println("indexOfLo = " + indexOfLo);

        String upperCase = s.toUpperCase();
        System.out.println("upperCase = " + upperCase);

        System.out.println(s.equals("Hello, world!"));

        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println("reversed = " + reversed);
    }
}
