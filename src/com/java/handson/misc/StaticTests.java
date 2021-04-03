package com.java.handson.misc;

public class StaticTests {
    static int number;

    static {
        number = 987;
        System.out.println("static block n: " + number);
    }

    StaticTests() {
        System.out.println("constructor");
    }


    public static void main(String[] args) {
        System.out.println("in main");
        StaticTests st = new StaticTests();
    }
}
class StaticSuper {

    static {
        System.out.println("super static block");

    }

    StaticSuper() {
        System.out.println("super contructor");
    }

}