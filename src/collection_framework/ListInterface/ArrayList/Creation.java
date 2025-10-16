package collection_framework.ListInterface.ArrayList;

import java.util.ArrayList;


public class Creation {

    static void main() {

        ArrayList<Integer> lst = new ArrayList<>(); // 1️⃣ This is how we create dynamic array list in java

        lst.add(2);
        lst.add(4);
        lst.add(8);
        lst.add(4);

        System.out.println(lst);    // [2, 4, 8, 4]

        var car = new ArrayList<String>();  // Creating list using Local Variable Type Inference

        car.add("Merc");
        car.add("BMW");
        car.add("Audi");

        System.out.println(car);    // [Merc, BMW, Audi]


    }
}
