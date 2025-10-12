package java8_Features.methodReference;

import java.util.Arrays;
import java.util.List;

public class MainClass_OfDemo1 {

    static void main() {

        List<String> names = Arrays.asList("Harsh", "Radhu", "Juhu", "vasu");

        List<StudentClass_Demo1> students = names.stream().map(StudentClass_Demo1::new).toList();
    }
}
