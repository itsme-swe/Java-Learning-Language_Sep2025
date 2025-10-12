package java8_Features.methodReference;

public class StudentClass_Demo1 {

    private String name;

    public StudentClass_Demo1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentClass_Demo1{" +
                "name='" + name + '\'' +
                '}';
    }
}

