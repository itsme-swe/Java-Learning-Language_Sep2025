package java8_Features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_IntermediateOperation {

    static void main() {

        List<Integer> lst1 = Arrays.asList(1, 3, 4, 7, 8, 10, 15, 14, 16, 17, 19, 21, 34);

        List<Integer> filteredEvenLst = lst1.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

        System.out.println(filteredEvenLst);    // [4, 8, 10, 14, 16, 34

        // map()
        List<Integer> sqNumUsingMap = filteredEvenLst.stream().map(x -> x * x).toList();    // map takes Function as an argument and return new value

        System.out.println(sqNumUsingMap);  // [16, 64, 100, 196, 256, 1156]


    }
}
