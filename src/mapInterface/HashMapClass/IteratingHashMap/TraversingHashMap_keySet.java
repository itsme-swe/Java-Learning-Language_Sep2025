package mapInterface.HashMapClass.IteratingHashMap;

import java.util.HashMap;

public class TraversingHashMap_keySet {

    static void main() {

        HashMap<Integer, String> car = new HashMap<>();

        car.put(1, "Virtus");
        car.put(2, "Thar Roxx");
        car.put(3, "Fortuner");
        car.put(4, "BMW 340i");

        // 1️⃣ Will return keys from map
        for (int i : car.keySet()) {
            System.out.println(i);
        }

        System.out.println();

        // 2️⃣ This will return values only when we use get() method
        for (int i : car.keySet()) {
            System.out.println(car.get(i));
        }


    }
}
