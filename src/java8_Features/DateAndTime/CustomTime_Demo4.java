package java8_Features.DateAndTime;

import java.time.LocalTime;

public class CustomTime_Demo4 {

    static void main() {

        LocalTime customTime = LocalTime.of(13, 30);

        System.out.println(customTime); // 13:30

        String time = "14:20";

        LocalTime parse = LocalTime.parse(time);    // This is how we convert string time into Local Time

        System.out.println(parse);  // 14:20


    }
}
