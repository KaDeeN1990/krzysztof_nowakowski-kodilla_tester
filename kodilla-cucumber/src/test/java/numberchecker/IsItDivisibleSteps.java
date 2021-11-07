package numberchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsItDivisibleSteps implements En {

    private int number;
    private String answer;

    public IsItDivisibleSteps(){
        Given("number is {int}", (Integer int1) -> {
            // Write code here that turns the phrase above into concrete actions
            number = int1;
        });
        When("i asked is it divisible", () -> {
            // Write code here that turns the phrase above into concrete actions
            NumberChecker numberChecker = new NumberChecker();
            this.answer = numberChecker.checkIfDivisible(number);
        });
        Then("i should be told {string}", (String answer) -> {
            Assert.assertEquals(answer, this.answer);
        });
    }
}
