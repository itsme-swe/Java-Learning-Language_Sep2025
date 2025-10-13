package java8_Features.DateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CurrentDate_Demo1 {

    static void main() {

        LocalDate dateNow = LocalDate.now();

        System.out.println(dateNow);    // 2025-10-13

        LocalDate yesterday = dateNow.minusDays(1); // ".minus" help us find the past dates, months, year too

        System.out.println(yesterday);  // 2025-10-12

        DayOfWeek dayOfWeek = yesterday.getDayOfWeek();

        System.out.println(dayOfWeek);  // SUNDAY

        LocalDate years = dateNow.minusYears(33);

        System.out.println(years);

        DayOfWeek yearsDayOfWeek = years.getDayOfWeek();

        System.out.println(yearsDayOfWeek); // Tuesday
        
    }
}
