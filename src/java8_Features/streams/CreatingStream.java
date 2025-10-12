package java8_Features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {

    static void main() {

        // 1️⃣ Converting Collection into Stream
        List<String> list = Arrays.asList("apple", "mango", "banana");

        Stream<String> myStream = list.stream();

        // 2️⃣ Converting array into Stream
        String[] arr = {"BMW", "Fortuner", "Virtus"};

        Stream<String> newArr = Arrays.stream(arr);

        // 3️⃣ Creating Stream directly
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);

        Stream<Integer> number = Stream.iterate(1, n -> n + 1).limit(10);

        number.forEach(System.out::println);


    }
}
