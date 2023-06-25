package com.epam.OOP;

public class Dog extends Animal {
    public Dog() {
        super("brown", 4, true);
    }

}
class Test1 {
    public static void main(String[] args) {

        Dog myDog = new Dog();
        System.out.println(myDog.getDescription());

    }
}
