package com.epam.loops;

import java.util.Scanner;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(numberTableToPrint + " x " + i + " = " + (numberTableToPrint * i));
        }
    }
    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.printTable(5);
    }
}
