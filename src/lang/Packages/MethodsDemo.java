package lang.Packages;

public class MethodsDemo {

    public static void main(String[] args) {

        Object obj1 = new Object();

        Object obj2 = new Object();

        System.out.println(obj1.equals(obj2));  // false

        System.out.println(obj1.toString());    // java.lang.Object@1efee8e7

        System.out.println(obj2.hashCode());    // 518522822
    }
}
