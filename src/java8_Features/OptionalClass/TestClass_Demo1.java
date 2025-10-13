package java8_Features.OptionalClass;

import java.util.Optional;

public class TestClass_Demo1 {

    private static Optional<String> getName(int id) {

        return Optional.of("Harsh");
//        return Optional.empty();
    }

    static void main() {

        Optional<String> name = getName(2);

        String nameToBeUsed = name.orElse("NA");

        System.out.println(nameToBeUsed);


    }
}

// Now if the DB will return null value but our program will not throw Null Pointer Exception
