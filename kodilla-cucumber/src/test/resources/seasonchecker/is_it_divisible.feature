Feature: is it divisible
  numbers can be divisible

  Scenario Outline: Number is divisible
    Given number is <number>
    When i asked is it divisible
    Then i should be told <answer>
    Examples:
    |number|answer|
    |5     |"Buzz"|
    |10    |"Buzz"|
    |3     |"Fizz"|
    |15    |"FizzBuzz"|
    |11    |"None"|