package com.epam.conditions;

public class TriangleSidesValidator {
    public void validate(double x1, double y1, double x2, double y2, double x3, double y3) {
        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double c = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("This is a valid triangle.");
        } else {
            System.out.println("It's not a triangle.");
        }
    }
}
class Test1{
    public static void main(String[] args) {
        TriangleSidesValidator validator = new TriangleSidesValidator();
        validator.validate(0, 0, 0, 1, 1, 0);
    }
}