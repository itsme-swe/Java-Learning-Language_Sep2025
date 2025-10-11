package java8_Features.functionalInterface.BiFunctionInterface;

import java.util.function.BiFunction;

public class MyClass {

    static void main() {

        BiFunction<String, String, Integer> addStringLength = (a, b) -> a.length() + b.length();

        int result = addStringLength.apply("Hello", "World");

        System.out.println(result); // 10
    }
}

/*
 * This functional interface which takes in 3 parameters namely:-

 *T: denotes the type of the first argument to the function
 *U: denotes the type of the second argument to the function
 *R: denotes the return type of the function

 * The main advantage of using a BiFunction is that it allows us to use 2 input arguments while in function we can only have 1 input argument.

 */
