package collection_framework.ListInterface.ComparatorInterface;

import java.util.ArrayList;

public class CustomSortingUsingLambda {

    static void main() {

        var car = new ArrayList<String>();

        car.add("Roxx");
        car.add("M340i");
        car.add("Virtus");
        car.add("Audi R8");

        car.sort((a, b) -> b.length() - a.length());    // using lambda expression

        for (String x : car) {
            System.out.print(x + " ");
        }
        System.out.println();   // Audi R8 Virtus M340i Roxx  ◽ Descending order

    }
}
