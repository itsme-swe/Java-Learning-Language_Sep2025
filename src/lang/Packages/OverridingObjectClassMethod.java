package lang.Packages;

class MyObject {

    public String toString() {
        return "I am overridden method!!!";
    }
}

public class OverridingObjectClassMethod {

    public static void main(String[] args) {

        MyObject obj1 = new MyObject();

        System.out.println(obj1.toString());    // I am overridden method!!!
    }
}
