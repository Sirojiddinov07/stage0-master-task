package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int sum = 0;
        int remainder;

        while(number > 0) {
            remainder = number % 10;
            sum += remainder;
            number = number / 10;
        }

        System.out.println("The sum of digits in the given number is: " + sum);
    }

}
class Test{
    public static void main(String[] args) {
        DigitsSumCalculator calculator = new DigitsSumCalculator();
        calculator.calculateSum(4567);
    }
}