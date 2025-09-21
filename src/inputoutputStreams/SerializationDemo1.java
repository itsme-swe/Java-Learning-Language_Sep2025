package inputoutputStreams;

import java.io.*;

class Student implements Serializable {

    int rollNo;
    String name;
    String dept;

    public Student(int rollNo, String name, String dept) {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
    }

    public String toString() {
        return rollNo + " " + name + " " + dept;
    }
}


public class SerializationDemo1 {

    public static void main(String[] args) throws Exception {

        FileOutputStream fos = new FileOutputStream("F:\\Java-Lang-Learning_Sep2025\\Student.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Student s1 = new Student(101, "John", "CSE");

        oos.writeObject(s1);

        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("F:\\Java-Lang-Learning_Sep2025\\Student.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s2 = (Student) ois.readObject();

        System.out.println(s2);

        ois.close();
        fis.close();


    }
}
