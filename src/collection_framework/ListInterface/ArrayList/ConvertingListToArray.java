package collection_framework.ListInterface.ArrayList;

import java.util.ArrayList;

public class ConvertingListToArray {

    static void main() {

        var courses = new ArrayList<String>(20);

        courses.add("Digital Marketing");
        courses.add("Trading");
        courses.add("Data Science");
        courses.add("Fullstack developer");

        System.out.println(courses);    // [Digital Marketing, Trading, Data Science, Fullstack developer]

        String[] array = courses.toArray(new String[0]);    // 9️⃣ converting list to array

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();   // Digital Marketing Trading Data Science Fullstack develope
    }
}
