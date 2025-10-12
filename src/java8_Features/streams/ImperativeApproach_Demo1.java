package java8_Features.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImperativeApproach_Demo1 {

    static void main() {

        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> even = new ArrayList<>();

        for (int i : number) {
            if (i % 2 == 0) {
                even.add(i);
            }
        }
        System.out.println(even);   // [2, 4, 6]
    }
}
