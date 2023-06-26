package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 0) {
            System.out.println("invalid date");
            return;
        }
        String result = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> "31";
            case 4, 6, 9, 11 -> "30";
            case 2 -> "";
            default -> "invalid date";
        };
        if (result.length() != 0) {
            System.out.println(result);
            return;
        }
        if (ifLeapYear(year)) {
            System.out.println("29");
        } else {
            System.out.println("28");
        }
    }

    private boolean ifLeapYear(int year) {
        boolean result = false;
        if (year % 4 == 0) {
            result = true;
            if (year % 100 == 0)
                result = year % 400 == 0;
        }
        return result;
    }
}