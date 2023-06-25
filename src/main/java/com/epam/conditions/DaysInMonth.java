package com.epam.conditions;

public class DaysInMonth {
    public void printDays(int year, int month) {
        // Check if year is negative
        if (year < 0) {
            System.out.println("Invalid date");
            return;
        }

        if (month < 1 || month > 12) {
            System.out.println("Invalid date");
            return;
        }

        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        int daysInMonth;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                daysInMonth = 31;
                break;
            case 4, 6, 9, 11:
                daysInMonth = 30;
                break;
            case 2:
                daysInMonth = isLeapYear ? 29 : 28;
                break;
            default:
                System.out.println("Invalid date");
                return;
        }

        System.out.println("There are " + daysInMonth + " days in " + year + "/" + month);
    }
}

class Test3{
    public static void main(String[] args) {
        DaysInMonth daysInMonth = new DaysInMonth();
        daysInMonth.printDays(2000, 2);
    }
}