package com.bvan.start.lessons3_4.conditions;

/**
 * @author bvanchuhov
 */
public class ExtendedWorkingWeekConditions {

    public static void main(String[] args) {
        int day = 6; // 1..7

        // && - AND
        // || - OR
        // ! - NOT

        boolean isSunday = day == 7;
        boolean isMonday = day == 1;
        boolean isWeekday = day >= 1 && day <= 5;
        boolean isWorkingDay = (isWeekday && !isMonday) || isSunday;

        if (isWorkingDay) {
            System.out.println("Work");
        } else {
            System.out.println("Friends");
        }

        System.out.println("Java Courses");
    }
}
