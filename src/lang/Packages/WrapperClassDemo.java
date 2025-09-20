package lang.Packages;

public class WrapperClassDemo {

    public static void main(String[] args) {

        int num = 10;

        Integer obj = num;  // autoboxing

        int value = obj;    // unboxing

        System.out.println(obj);
    }
}
