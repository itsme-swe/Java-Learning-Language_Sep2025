package collection_framework.ListInterface.ComparatorInterface;

import java.util.ArrayList;
import java.util.List;

public class MyClass {

    static void main() {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 3.5));
        students.add(new Student("Charles", 3.7));
        students.add(new Student("Bob", 3.4));
        students.add(new Student("Radhu", 5.4));

        // 🔶 Using lambda expression to arrange in descending order
        students.sort((o1, o2) -> {
            if (o2.getCgpa() - o1.getCgpa() > 0) {
                return 1;
            } else if (o2.getCgpa() - o1.getCgpa() < 0) {
                return -1;
            } else {
                return 0;
            }
        });

        for (Student x : students) {
            System.out.println(x.getName() + ": " + x.getCgpa());
        }
    }
}
