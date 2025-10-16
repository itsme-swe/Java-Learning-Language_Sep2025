package collection_framework.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {

    static void main() {

        List<Integer> nums = new ArrayList<>();

        nums.add(30);
        nums.add(2);
        nums.add(20);
        nums.add(15);
        nums.add(50);
        nums.add(15);

        Collections.sort(nums);

        for (var x : nums) {
            System.out.print(x + " ");
        }
        System.out.println();   // 2 15 15 20 30 50
    }
}
