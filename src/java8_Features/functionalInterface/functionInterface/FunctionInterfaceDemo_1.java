package java8_Features.functionalInterface.functionInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionInterfaceDemo_1 {

    private static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    static void main(String[] args) {

        Function<String, Integer> func1 = x -> x.length();

        Function<String, String> func2 = s -> s.substring(0, 3);

        Function<List<Student>, List<Student>> studentsWithHaasPrefix = li -> {

            List<Student> result = new ArrayList<>();
            for (Student s : li) {
                if (func2.apply(s.getName()).equalsIgnoreCase("Har")) {
                    result.add(s);
                }
            }
            return result;
        };

        Student s1 = new Student(2, "Harsh");
        Student s2 = new Student(5, "Jaspreet");
        Student s3 = new Student(7, "Harpreet");
        Student s4 = new Student(9, "Jagjeet");

        List<Student> students = Arrays.asList(s1, s2, s3, s4);

        List<Student> filteredStudents = studentsWithHaasPrefix.apply(students);

        System.out.println(filteredStudents);


    }
}
