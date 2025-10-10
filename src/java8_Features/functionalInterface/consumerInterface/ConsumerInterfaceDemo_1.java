package java8_Features.functionalInterface.consumerInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceDemo_1 {

    static void main(String[] args) {

        Consumer<String> consumer = s -> System.out.println(s);

        consumer.accept("Harsh");

        Consumer<List<Integer>> conList1 = li -> {
            for (Integer i : li) {
                System.out.print(i + 10 + " ");
            }
        };

        Consumer<List<Integer>> consList2 = li -> {
            for (Integer x : li) {
                System.out.print(x + " ");
            }
        };

        consList2.andThen(conList1).accept(Arrays.asList(1, 2, 3, 4, 5));   // 1 2 3 4 5 11 12 13 14 15
    }
}
