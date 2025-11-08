package mapInterface.HashMapClass.IteratingHashMap;

import java.util.HashMap;

public class IteratingUsing_forEachLambda {

    static void main() {

        HashMap<Integer, String> carCollection = new HashMap<>();

        carCollection.put(1, "Virtus");
        carCollection.put(2, "ScorpioN");
        carCollection.put(3, "Fortuner GRs");
        carCollection.put(4, "BMW M3 xDrive");

        // 1️⃣ Using forEach() with Lambda Expressions (Java 8+): This provides a concise way to iterate and perform an action on each entry.
        carCollection.forEach((key, value) -> System.out.println(key + ": " + value));

        /*
         1: Virtus
         2: ScorpioN
         3: Fortuner GRs
         4: BMW M3 xDrive
        * */
    }
}
