package collection_framework.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AddingAndIterating {

    static void main() {

        List<Integer> arrList = new ArrayList<>();

        // 2️⃣ Adding elements in array list use add() method
        arrList.add(8);
        arrList.add(2);
        arrList.add(5);
        arrList.add(2);
        arrList.add(10);

        // 3️⃣ Iterating array list using for each loop
        for (int x : arrList) {
            System.out.print(x + " ");
        }

        // op: 8 2 5 2 10


    }
}
