package com.newjava.feaures;

public class App {

    public static void displayObjectType (Object object) {
        switch (object) {
            case Integer i -> System.out.println("It's an integer");
            case String s -> System.out.println("It's a string");
            case null -> System.out.println("The object is null");
            default -> System.out.println("It's none of these types");
        }
    }

    public static void displayObjectInformation(Object object) {
        switch (object) {
            case Integer i -> System.out.println("It's an integer");
            case String s && s.contains("l") -> System.out.println("It's a string containing l" + s);
            case null -> System.out.println("The object is null");
            default -> System.out.println("It's none of these types");
        }
    }

    public static void main(String[] args) {

        displayObjectType("Sally");
        displayObjectType("Sam");
        displayObjectInformation(3);
        displayObjectType(null);
        displayObjectInformation('l');


        displayObjectInformation("Sally");
        displayObjectInformation("Sam");
        displayObjectInformation(3);
        displayObjectInformation(null);
        displayObjectInformation('l');
    }
}
