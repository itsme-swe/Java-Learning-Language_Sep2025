package java8_Features.functionalInterface;

@FunctionalInterface
interface InterfaceDemo {

    void sayWelcome();

    default void sayBye() {
        System.out.println("Good Bye!!");
    }
}

public class DefaultMethodInsideFunctionalInterface {

    static void main(String[] args) {

    }
}
