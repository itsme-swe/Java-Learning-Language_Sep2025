package java8_Features.functionalInterface.UnaryOperator;

import java.util.function.UnaryOperator;

public class MyClass {

    static void main() {

        UnaryOperator<Integer> sqOfNum = x -> x * x;

        System.out.println(sqOfNum.apply(5));   // 25
    }
}

/*
 * UnaryOperator in Java 8 is a functional interface from the java.util.function package that represents an operation on a single operand and produces a result of the same type as its operand. It is a specialization of the Function<T, T> interface, meaning both its argument and return type are identical.
 * */
