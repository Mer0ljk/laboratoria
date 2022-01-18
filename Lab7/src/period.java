import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class period {

    LocalDate date1 = LocalDate.of(2000, Month.JANUARY, 9);
    LocalDate date2 = LocalDate.of(2000, Month.FEBRUARY, 2);

    Period period = Period.between(date1, date2);

}
