package mapInterface.HashMapClass.IteratingHashMap;

import java.util.HashMap;
import java.util.Map;

public class IteratingUsing_entrySet {

    static void main() {

        HashMap<String, Integer> fruits = new HashMap<>();

        fruits.put("Orange", 10);
        fruits.put("Kiwi", 30);
        fruits.put("Apple", 20);
        fruits.put("Banana", 5);

        // 1️⃣ Iterating using entrySet() (Recommended for accessing both key and value)
        for (Map.Entry<String, Integer> i : fruits.entrySet()) {
            System.out.println(i.getKey() + ": " + i.getValue());
        }

        /*
        * Apple: 20
          Kiwi: 30
          Orange: 10
          Banana: 5
         */
    }
}
