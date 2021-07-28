package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static com.kodilla.basic_assertion.ResultChecker.assertEquals1;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    public void testRoznica() {
        Calculator calculator = new Calculator();
        int a = 12;
        int b = 8;
        int roznicaResult = calculator.roznica(a, b);
        assertEquals( 4, roznicaResult);
    }
    public void testPotega() {
        Calculator calculator = new Calculator();
        int a = 3;
        int kwadratResult = calculator.kwadrat(a);
        System.out.println(kwadratResult);
        assertEquals1( 20, kwadratResult, 2);

    }
}
