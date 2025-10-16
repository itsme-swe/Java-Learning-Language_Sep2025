package collection_framework.ListInterface.ComparatorInterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomSortingUsingComparator_Java8 {

    static void main() {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 3.5));
        students.add(new Student("Charles", 3.7));
        students.add(new Student("Bob", 3.4));
        students.add(new Student("Radhu", 5.4));

        Comparator<Student> comparator = Comparator.comparing(Student::getCgpa).reversed(); // Java 8 feature

        students.sort(comparator);

        for (Student x : students) {
            System.out.println(x.getName() + ": " + x.getCgpa());
        }

    }
}

/*
Radhu: 5.4
Charles: 3.7
Alice: 3.5
Bob: 3.4
* */
