package com.kodilla.basic_assertion;

public class ResultChecker {
    public static boolean assertEquals(int expected, int actual) {
        return expected == actual;
    }
    public static boolean assertEquals1(int expected, int actual, int delta) {
        return expected < actual + delta || expected > actual - delta;
    }
}
