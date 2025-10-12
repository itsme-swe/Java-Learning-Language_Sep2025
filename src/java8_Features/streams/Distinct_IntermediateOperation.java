package java8_Features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct_IntermediateOperation {

    static void main() {

        List<Integer> newList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 2, 0, 4);

        List<Integer> filterFirst = newList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

        System.out.println(filterFirst);

        // distinct() and sorted()
        List<Integer> mapThen = filterFirst.stream()
                .distinct() // distinct() help us to add only unique values
                .sorted((a, b) -> b - a)    // sorted in descending order
                .map(x -> x * x)
                .toList();

        System.out.println(mapThen);    // [36, 16, 4, 0]
    }
}
