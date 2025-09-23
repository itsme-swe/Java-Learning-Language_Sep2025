package javaDateAndTime.newWay_TimeAPI;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeDemo {

    public static void main(String[] args) {

        LocalDateTime current = LocalDateTime.now();

        Month month = current.getMonth();

        System.out.println("The current month is: " + month);   // The current month is: SEPTEMBER

        int day = current.getDayOfMonth();

        System.out.println("Today is " + day);  // 23
    }
}
