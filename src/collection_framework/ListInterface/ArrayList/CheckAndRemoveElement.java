package collection_framework.ListInterface.ArrayList;

import java.util.ArrayList;

public class CheckAndRemoveElement {

    static void main() {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(8);
        list.add(2);
        list.add(5);
        list.add(2);
        list.add(10);

        // 4️⃣ contains() return an boolean value, if we check element is present in list or not present in list
        System.out.println(list.contains(2));   // true

        System.out.println(list.contains(50));  // false

        // 5️⃣ remove(idx_val) method takes index value as parameter to remove element present at passed index value
        list.remove(1);

        // 6️⃣ We can use for loop also to iterate a list but in array we use list[i] but in ArrayList we do use get() method to fetch an element
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        // op: 8 5 2 10

        list.remove(Integer.valueOf(2));    // Even we can remove an element also from array list without mentioning index value

        System.out.println(list);   // [8, 5, 10]
    }
}
