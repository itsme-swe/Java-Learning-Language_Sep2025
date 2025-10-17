package collection_framework.ListInterface.Vector;

import java.util.Vector;

public class PassingInitialCapacity {

    static void main() {

        Vector<String> names = new Vector<>(5, 3);

        System.out.println("Initial Capacity: " + names.capacity());    // Initial Capacity: 5

        names.add("Rohit");
        names.add("Mohit");
        names.add("Sohan");
        names.add("Harsh");


        System.out.println(names);  // [Rohit, Mohit, Sohan, Harsh]

        System.out.println("Size of Vector: " + names.size());  // Size of Vector: 4

        names.add("Radhu");
        names.add("Vasu");

        System.out.println("Initial Capacity after adding elements: " + names.capacity());  // Initial Capacity after adding elements: 8
    }
}

/*
 * Here we passed in constructor the initial capacity of vector and if the capacity gets full then it will be increased by the given element. If we do not pass initial capacity then it automatically get increased by 10.
 *
 * */
