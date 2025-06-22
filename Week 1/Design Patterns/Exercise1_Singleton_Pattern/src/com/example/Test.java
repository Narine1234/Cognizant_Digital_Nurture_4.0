package com.example;

public class Test {
    public static void main(String[] args) {
        Logger obj1 = Logger.getInstance();
        Logger obj2 = Logger.getInstance();

        if (obj1 == obj2)
            System.out.println("Singleton Pattern: All objects refer to same reference.");
        else
            System.out.println("Not a Singleton pattern.");
    }
}
