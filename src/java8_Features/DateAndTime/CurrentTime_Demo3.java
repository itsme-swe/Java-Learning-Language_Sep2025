package java8_Features.DateAndTime;

import java.time.LocalTime;

public class CurrentTime_Demo3 {

    static void main() {

        LocalTime timeNow = LocalTime.now();

        System.out.println(timeNow);    // 07:42:19.423950800
    }
}
