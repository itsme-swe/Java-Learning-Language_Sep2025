package java8_Features.lambdaExpression;

@FunctionalInterface
public interface Employee_Interface {

    String getName(String name);

    default void sayHello(String name) {
        System.out.println(getName(name));
    }

    static void welcomeMsg(String name) {
        System.out.println("Welcome to the course Mr/MS " + name);
    }

}
