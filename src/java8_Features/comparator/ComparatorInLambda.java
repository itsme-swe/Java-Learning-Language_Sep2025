package java8_Features.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorInLambda {

    static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(45);
        list.add(50);
        list.add(60);
        list.add(5);

        Collections.sort(list); // used to sort in ascending order

        System.out.println(list);   // [5, 20, 45, 50, 60]

        Collections.sort(list, (a, b) -> b - a);    // But here with the help of comparator using lambda expression we can arrange in descending order.

        System.out.println(list);   // [60, 50, 45, 20, 5]


    }
}
