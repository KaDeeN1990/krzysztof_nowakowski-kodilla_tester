package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"Krzysztof.1", "Now4Kowski"})
    public void shouldUserValidatorTest(String input){
        assertTrue(validator.validateUsername(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"Krz.Now@po.on.pl"})
    public void shouldEmailValidatorTest(String input){
        Pattern pattern = Pattern.compile("^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$");
        assertTrue(pattern.matcher("Krz.Now@po.on.pl").matches());
    }
}