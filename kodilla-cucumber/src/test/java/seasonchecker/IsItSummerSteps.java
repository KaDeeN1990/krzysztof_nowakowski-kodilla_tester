package seasonchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

import java.time.MonthDay;

public class IsItSummerSteps implements En {
    private MonthDay today;
    private String answer;

    public IsItSummerSteps() {
        Given("today is last day of december", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.today = MonthDay.of(12,31);
        });

        Given("today is first day of august", () -> {
            this.today = MonthDay.of(8, 1);
        });
        Given("today is first day of december", () -> {
            this.today = MonthDay.of(12, 1);
        });
        Given("today is 21 day of august", () -> {
            this.today = MonthDay.of(8, 21);
        });

        When("I ask whether it's Summer", () -> {
            SeasonChecker seasonChecker = new SeasonChecker();
            this.answer = seasonChecker.checkIfSummer(this.today);
        });

        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
        }

    }