package lambdaExpression;

@FunctionalInterface
interface MyLambda {
    public void display();

}

public class LambdaDemo {

    static void main(String[] args) {

        MyLambda m = () -> {
            System.out.println("Hello world");
        };

        m.display();
    }
}
