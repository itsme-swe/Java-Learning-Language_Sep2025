package java8_Features.functionalInterface;

@FunctionalInterface    // annotation restrict the interface to be Functional Interface
interface MyInterface {

    void sayHello(); // abstract method --> method which is not having body

}


public class FunctionalInterface_Demo1 {

    static void main(String[] args) {

        MyInterface greet = () -> System.out.println("Hello World");

        greet.sayHello();   // Hello World
    }
}
