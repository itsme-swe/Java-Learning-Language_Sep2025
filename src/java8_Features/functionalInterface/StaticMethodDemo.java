package java8_Features.functionalInterface;

interface StaticDemo {

    static void sayHello() {
        System.out.println("Hello");
    }
}

public class StaticMethodDemo implements StaticDemo {

    static void main(String[] args) {

        StaticMethodDemo myClass = new StaticMethodDemo();

        StaticDemo.sayHello();  // Hello


    }
}

/*
 * The only way to call static methods of interface inside main class by using reference of interface itself.
 * */
