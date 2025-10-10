package java8_Features.functionalInterface.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo2_NumIsEven {

    static void main(String[] args) {

        Predicate<Integer> isEven = num -> num % 2 == 0;    // isEven a predicate variable which is holding condition whether number is even or not

        List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6);

        for (Integer ele : li) {
            if (isEven.test(ele)) {
                System.out.print(ele + " ");
            }
        }

        // 2 4 6
    }
}
