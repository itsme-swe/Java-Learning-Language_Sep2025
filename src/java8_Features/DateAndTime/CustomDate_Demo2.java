package java8_Features.DateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CustomDate_Demo2 {

    static void main() {

        LocalDate customDate = LocalDate.of(1992, 6, 5);

        System.out.println(customDate); // 1992-06-05

        int dayOfMonth = customDate.getDayOfMonth();

        DayOfWeek dayOfWeek = customDate.getDayOfWeek();

        System.out.println(dayOfMonth); // 5

        System.out.println(dayOfWeek);  // Friday
    }
}
