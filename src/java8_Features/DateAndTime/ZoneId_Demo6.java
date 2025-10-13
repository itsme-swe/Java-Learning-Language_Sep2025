package java8_Features.DateAndTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneId_Demo6 {

    static void main() {

        ZonedDateTime indianTime = ZonedDateTime.now();

        System.out.println("Current time in India: " + indianTime); // Current time in India: 2025-10-13T08:08:37.478801900+05:30[Asia/Calcutta

        ZonedDateTime americaTime = ZonedDateTime.now(ZoneId.of("America/New_York"));

        System.out.println("Current time in the USA: " + americaTime);  // Current time in the USA: 2025-10-12T22:38:37.482790400-04:00[America/New_York]
    }
}
