package mapInterface.HashMapClass;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Demo2 {

    static void main() {

        Map<Integer, String> mp = new HashMap<>();

        mp.put(201, "Harsh");
        mp.put(109, "Juhu");
        mp.put(99, "Aman");
        mp.put(203, "Megha");

        System.out.println(mp.get(99)); // Aman

        System.out.println(mp.get(110));    // null

        System.out.println(mp.containsKey(201));    // if key is present then returns a boolean value --- true

    }
}
