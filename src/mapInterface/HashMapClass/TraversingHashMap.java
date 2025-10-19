package mapInterface.HashMapClass;

import java.util.HashMap;
import java.util.Map;

public class TraversingHashMap {

    static void main() {

        HashMap<Integer, String> car = new HashMap<>();

        car.put(1, "Virtus");
        car.put(2, "Thar Roxx");
        car.put(3, "Fortuner");
        car.put(4, "BMW 340i");

        for (int i : car.keySet()) {
            System.out.println(car.get(i));
        }

        /*
        Virtus
        Thar Roxx
        Fortuner
        BMW 340i
        */

        for (Map.Entry<Integer, String> x : car.entrySet()) {
            System.out.println(x.getKey() + ": " + x.getValue());
        }

        /*
         1: Virtus
         2: Thar Roxx
         3: Fortuner
         4: BMW 340i
         */
    }
}
