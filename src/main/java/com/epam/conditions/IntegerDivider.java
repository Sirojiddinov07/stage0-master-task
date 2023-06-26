package com.epam.conditions;


public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        try {
            int quotient = dividend / divider;
            int product = quotient * divider;
            if (product == dividend) {
                System.out.println("Can be divided completely");
            } else {
                System.out.println("Cannot be divided completely");
            }
        } catch (ArithmeticException e) {
            System.out.println("Division by zero!");
        }
    }
}

