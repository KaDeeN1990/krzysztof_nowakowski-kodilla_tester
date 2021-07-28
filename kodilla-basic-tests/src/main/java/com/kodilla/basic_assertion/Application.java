package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum działa niepoprawnie dla liczb " + a + " i " + b);
        }

        int rozResult = calculator.roznica(a, b);
        boolean correct1 = ResultChecker.assertEquals(-3, rozResult);
        if (correct1) {
            System.out.println("Roznica dziala poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Roznica dziala niepoprawnie");
        }
        int kwadratResult = calculator.kwadrat(a);
        boolean correct2 = ResultChecker.assertEquals(25, kwadratResult);
        if (correct2) {
            System.out.println("Kwadrat liczby " + a + " działa poprawnie");
        } else {
            System.out.println("Kwadrat liczby" + a + "działa niepoprawnie");
        }
    }
}

