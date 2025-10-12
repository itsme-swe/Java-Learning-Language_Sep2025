package java8_Features.methodReference;

import java.util.Arrays;
import java.util.List;

public class Test_Demo1 {

    public static void print(String s) {
        System.out.print(s + " ");
    }

    static void main() {

        List<String> str = Arrays.asList("Harsh", "Radhu", "Juhu", "vasu");

        str.forEach(x -> System.out.print(x + " "));    // 1️⃣ Using lambda expression to iterate over list

        System.out.println();

        str.forEach(Test_Demo1::print); // 2️⃣ Using Method reference to iterate the list and then printing the list
    }
}
