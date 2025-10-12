package java8_Features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_IntermediateOperation {

    static void main() {

        List<Integer> lst = Arrays.asList(1, 5, 2, 8, 6, 7, 9, 15, 24, 14, 55, 20);

        // filter()
        List<Integer> filterEvens = lst.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());  // filter takes "Predicate" as an argument

        System.out.println(filterEvens);    // [2, 8, 6, 24, 14, 20]
    }
}
