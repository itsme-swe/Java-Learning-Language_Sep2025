package java8_Features.DateAndTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTime_Demo5 {

    static void main() {

        ZonedDateTime now = ZonedDateTime.now();

        System.out.println(now);    // 2025-10-13T08:01:45.750744+05:30[Asia/Calcutta]

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();    // will return us all the zoneIds present in Java

        System.out.println(availableZoneIds);   // [Asia/Aden, America/Cuiaba, Etc/GMT+9, Etc/GMT+8, Africa/Nairobi...etc]
    }
}
