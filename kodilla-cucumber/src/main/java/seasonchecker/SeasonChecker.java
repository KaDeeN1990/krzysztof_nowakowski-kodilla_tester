package seasonchecker;

import java.time.MonthDay;
import java.util.Date;

public class SeasonChecker {
    public String checkIfSummer(MonthDay date) {
        if(date.isAfter(MonthDay.of(6, 21)) && date.isBefore(MonthDay.of(9, 23))) {
            return "Yes its summer"; }
        return "Nope";
    }
}
