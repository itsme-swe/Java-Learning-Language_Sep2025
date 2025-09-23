package javaDateAndTime.newWay_TimeAPI;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeDemo {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();

        System.out.println(time);   // 16:44:11.402407400

        LocalDateTime dt = LocalDateTime.now();

        System.out.println(dt); // 2025-09-23T16:48:21.401266900


        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");

        String formatedDateTime = dt.format(date);

        System.out.println(formatedDateTime);   // 23-09-2025 04:49:47


    }
}
