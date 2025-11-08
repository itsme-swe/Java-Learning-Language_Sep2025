package mapInterface.HashMapClass.IteratingHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratingUsing_Iterator {

    static void main() {

        HashMap<String, Integer> fruits = new HashMap<>();

        fruits.put("Orange", 10);
        fruits.put("Kiwi", 30);
        fruits.put("Apple", 20);
        fruits.put("Banana", 5);

        // 1️⃣ Iterating using Iterator (More traditional approach)
        Iterator<Map.Entry<String, Integer>> iterator = fruits.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> i = iterator.next();
            System.out.println(i.getKey() + ": " + i.getValue());
        }

        /*
        * Apple: 20
          Kiwi: 30
          Orange: 10
          Banana: 5
        *
        *
        *
        * */
    }
}
