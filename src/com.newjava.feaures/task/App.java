package com.newjava.feaures.task;

import java.util.List;

public class App {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();
        pickTheBeverage(coffee);
        pickTheBeverage(tea);
        pickTheBeverage(new Beverage());
        newInstanceOf(tea);
        CreamSoda creamSoda = new CreamSoda(100);
        newMethodsInStream();
    }

    private static void pickTheBeverage(Consume beverage) {
        switch (beverage) {
            case Coffee c -> c.addCream();
            case Tea t -> t.stirTea();
            default -> System.out.println("It's ready to go");
        }
        beverage.consume();
    }

    private static void newInstanceOf(Beverage beverage) {
        if (beverage instanceof Tea tea) {
            tea.stirTea();
        }
    }

    private static void newTextBlock() {
        String html = """
                <html>
                    <body>
                        <h1>Hello, world!</h1>
                        <p>This is an example of a multi-line string using text blocks.</p>
                    </body>
                </html>
                """;
        System.out.println(html);
    }

    private static void newMethodsInStream() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("Even numbers: " + evenNumbers); // [2, 4, 6, 8, 10]

        List<Integer> firstFiveNumbers = numbers.stream()
                .takeWhile(n -> n <= 5)
                .toList();
        System.out.println("First five numbers: " + firstFiveNumbers); // [1, 2, 3, 4, 5]

        List<Integer> remainingNumbers = numbers.stream()
                .dropWhile(n -> n <= 5)
                .toList();
        System.out.println("Remaining numbers: " + remainingNumbers);  // [6, 7, 8, 9, 10]
    }
}
