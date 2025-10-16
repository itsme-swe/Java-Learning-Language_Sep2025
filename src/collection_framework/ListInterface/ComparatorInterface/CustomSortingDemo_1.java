package collection_framework.ListInterface.ComparatorInterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class StringlengthComparator implements Comparator<String> {

    public int compare(String s1, String s2) {
        return s2.length() - s1.length();
    }
}

public class CustomSortingDemo_1 {

    static void main() {

        List<String> fruits = new ArrayList<>();

        fruits.add("ABC");
        fruits.add("CADDA");
        fruits.add("BCAA");


        System.out.println(fruits); // [ABC, CADDA, BCAA]

        fruits.sort(new StringlengthComparator());

        System.out.println(fruits); // [CADDA, BCAA, ABC]   ◽ descending order
    }
}

// 🔶 Here we are creating a class which is implementing Comparator Interface to write a logic to arrange string in descending order on the basis of length.
