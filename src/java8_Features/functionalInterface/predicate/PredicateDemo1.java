package java8_Features.functionalInterface.predicate;

import java.util.function.Predicate;

public class PredicateDemo1 {

    static void main(String[] args) {

        Predicate<Integer> isAdult = age -> age >= 18;

        System.out.println(isAdult.test(15));   // false

        System.out.println(isAdult.test(19));   // true
    }
}
