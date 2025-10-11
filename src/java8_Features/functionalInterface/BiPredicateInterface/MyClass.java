package java8_Features.functionalInterface.BiPredicateInterface;

import java.util.function.BiPredicate;

public class MyClass {

    public static boolean stringEquals(String s1, String s2) {
        return s1.equals(s2);
    }

    static void main() {

        BiPredicate<String, String> lambda1 = (a, b) -> MyClass.stringEquals(a, b);

        BiPredicate<String, String> lambda2 = (a, b) -> a.equals(b);

        BiPredicate<String, String> ref = MyClass::stringEquals;

        boolean result1 = lambda1.test("Harsh", "harsh");

        boolean result2 = lambda2.test("abc", "abc");

        boolean refResult = ref.test("yes", "no");

        System.out.println(result1);    // false

        System.out.println(result2);    // true

        System.out.println(refResult);  // false
    }
}
