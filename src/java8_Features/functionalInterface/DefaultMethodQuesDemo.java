/*
 * Here we have two interfaces with the same methods, now interviewer can ask will it give an error or not when a class (DefaultMethodQuesDemo) implements both interfaces, Java cannot decide which default implementation to inherit — this causes the diamond problem in interfaces. If yes then how we can resolve it.
 *
 Sol ⇒ We can override the method inside main class and can use super keyword along with the reference of Interface we want to use.
 * */

package java8_Features.functionalInterface;


interface A {

    default void sayHello() {
        System.out.println("A says hello!!");
    }
}

interface B {
    default void sayHello() {
        System.out.println("B says hello!!");
    }
}

public class DefaultMethodQuesDemo implements A, B {

    @Override
    public void sayHello() {
        B.super.sayHello(); // explicitly call B’s version
    }

    static void main(String[] args) {

        DefaultMethodQuesDemo myClass = new DefaultMethodQuesDemo();

        myClass.sayHello(); // B says hello!!

    }

}
