package collection_framework.ListInterface.Stack;

import java.util.Stack;

public class AddingElements {

    static void main() {

        var carNames = new Stack<>();

        carNames.push("Virtus");
        carNames.push("Roxx");
        carNames.push("Fortuner");
        carNames.push("BMW M340i");

        System.out.println(carNames);   // [Virtus, Roxx, Fortuner, BMW M340i]
    }
}

/*
 *  push() method is used to add elements in Stack
 * */
