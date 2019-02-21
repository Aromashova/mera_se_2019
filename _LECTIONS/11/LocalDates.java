import static java.time.temporal.TemporalAdjusters.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class LocalDates {

    public static void main(String[] args) {
       // System.out.println(new Date(2019,2,21));

        LocalDate date = LocalDate.now();
        LocalDate march = date.plus(22, ChronoUnit.DAYS);
        System.out.println(date);
        System.out.println(march);

        LocalDate lastDay = march.with(lastDayOfYear());
        System.out.println(lastDay);

        ZonedDateTime zoned = ZonedDateTime.now();
        System.out.println(zoned);
        System.out.println(zoned.withZoneSameInstant(ZoneId.of( "America/Chicago")));
        System.out.println(zoned.withZoneSameLocal(ZoneId.of( "America/Chicago")));
    }
}
