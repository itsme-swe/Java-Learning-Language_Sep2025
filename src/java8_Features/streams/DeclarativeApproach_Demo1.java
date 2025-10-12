package java8_Features.streams;

import java.util.Arrays;
import java.util.List;

public class DeclarativeApproach_Demo1 {

    static void main() {

        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> evenNum = number.stream().filter(x -> x % 2 == 0).toList();

        System.out.println(evenNum);    // [2, 4, 6]
    }
}
