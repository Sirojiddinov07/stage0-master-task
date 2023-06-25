package com.epam.conditions;

public class SeasonDeterminer {
    public void  tellTheSeason(int monthNumber) {
        if(monthNumber == 12 ) { // checks for winter months
            System.out.println("Winter");
        }
        else if(monthNumber == 1 ) { // checks for winter months
            System.out.println("Winter");
        }
        else if(monthNumber == 2 ) { // checks for winter months
            System.out.println("Winter");
        }
        else if(monthNumber >= 3 && monthNumber <= 5) {
            System.out.println("Spring");
        }
        else if(monthNumber >= 6 && monthNumber <= 8) {
            System.out.println("Summer");
        }
        else if(monthNumber >= 9 && monthNumber <= 11) {
            System.out.println("Autumn");
        }
        else {
            System.out.println("Wrong month number");
        }
    }
}
class Test{
    public static void main(String[] args) {
        SeasonDeterminer seasonDeterminer = new SeasonDeterminer();
        seasonDeterminer.tellTheSeason(12);
    }
}
