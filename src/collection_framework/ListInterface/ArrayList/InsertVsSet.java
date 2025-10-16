package collection_framework.ListInterface.ArrayList;

import java.util.ArrayList;

public class InsertVsSet {

    static void main() {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);

        System.out.println(arr);    // [2, 4, 6, 8]

        arr.add(2, 10); // 7️⃣ add(idx, newElement) method is also used to insert new element in ArrayList

        System.out.println(arr);    // [2, 4, 10, 6, 8]

        arr.set(2, 15); // 8️⃣ set(idx_val, element) method will replace the element present at given index value

        for (Integer x : arr) {
            System.out.print(x + " ");
        }
        // 2 4 15 6 8

    }
}
