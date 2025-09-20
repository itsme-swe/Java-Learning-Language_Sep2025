package lambdaExpression;

interface MyNew {
    public void display(String s);
}

public class MethodRefToConstructor {

    public MethodRefToConstructor(String s) {
        System.out.println(s.toUpperCase());
    }

    public static void main(String[] args) {

        MyNew mn = MethodRefToConstructor::new;

        mn.display("hello");
    }
}
