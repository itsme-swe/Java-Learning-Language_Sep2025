package java8_Features.functionalInterface.predicate;

import java.util.function.Predicate;

public class PredicateDemo3_usingAnd {

    static void main(String[] args) {

        Predicate<String> startsWith = ele -> ele.toLowerCase().charAt(0) == 'h';

        Predicate<String> endsWith = ele -> ele.toLowerCase().charAt(ele.length() - 1) == 'o';

        Predicate<String> andOperator = startsWith.and(endsWith);

        System.out.println(andOperator.test("helli"));  // false bocz in and() operator both conditions need to be true.


    }
}
