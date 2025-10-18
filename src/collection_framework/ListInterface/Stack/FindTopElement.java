package collection_framework.ListInterface.Stack;

import java.util.Stack;

public class FindTopElement {

    static void main() {

        Stack<String> places = new Stack<>();

        places.push("Sangla Valley");
        places.push("Lahol Valley");
        places.push("Ladakh");
        places.push("Manna");


        String lastElement = places.peek();

        System.out.println(lastElement);    // Manna
    }
}
