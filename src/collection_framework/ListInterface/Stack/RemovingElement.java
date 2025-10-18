package collection_framework.ListInterface.Stack;

import java.util.Stack;

public class RemovingElement {

    static void main() {

        Stack<Double> engCapacity = new Stack<>();

        engCapacity.push(1.5);
        engCapacity.push(2.2);
        engCapacity.push(2.8);
        engCapacity.push(3.0);

        for (Double x : engCapacity) {
            System.out.print(x + " ");
        }
        System.out.println();

        // 1.5 2.2 2.8 3.0

        engCapacity.pop();

        System.out.println(engCapacity);    // [1.5, 2.2, 2.8]
    }

}

/*
 * pop() method is used to remove the last element or top element of stack. Stack used LIFO mechanism
 * */
