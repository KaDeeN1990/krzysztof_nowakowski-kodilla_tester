package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonTest {
    static Stream<Arguments> provideDouble(){
        return Stream.of(
          Arguments.of(1.73, 40, "Very severely underweight"),
          Arguments.of(1.73, 45, "Severely underweight"),
          Arguments.of(1.73, 50, "Underweight"),
          Arguments.of(1.73, 70, "Normal (healthy weight)"),
          Arguments.of(1.73, 80, "Overweight"),
          Arguments.of(1.73, 90, "Obese Class I (Moderately obese)"),
          Arguments.of(1.73, 110, "Obese Class II (Severely obese)"),
          Arguments.of(1.73, 120, "Obese Class III (Very severely obese)"),
          Arguments.of(1.73, 140, "Obese Class IV (Morbidly Obese)"),
          Arguments.of(1.73, 150, "Obese Class V (Super Obese)"),
          Arguments.of(1.73, 190, "Obese Class VI (Hyper Obese)")
        );
    }
}
