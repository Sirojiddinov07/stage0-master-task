package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int reversed = 0;

        while (number != 0) {
            reversed = (reversed * 10) + (number % 10);
            number /= 10;
        }

        System.out.println("Reversed number: " + reversed);
    }
}

class Test2{
    public static void main(String[] args) {
        NumberReverter reverter = new NumberReverter();
        reverter.revert(489);
    }
}


