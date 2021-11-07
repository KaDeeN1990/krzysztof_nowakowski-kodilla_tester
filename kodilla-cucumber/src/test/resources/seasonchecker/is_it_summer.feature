Feature: Is it Summer?
  Everybody likes Summer

  Scenario Outline: Winter isn't Summer
    Given today is <day>
    When I ask whether it's Summer
    Then I should be told <answer>
    Examples:
    |day|answer|
    |first day of december|"Nope"|
    |last day of december |"Nope"|
    |first day of august   |"Yes its summer"|
    |21 day of august      |"Yes its summer"|