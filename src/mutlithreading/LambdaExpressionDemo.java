package mutlithreading;

public class LambdaExpressionDemo {

    public static void main(String[] args) {

        Runnable r = () -> System.out.println("Thread is Running...");
        new Thread(r).start();
    }
}
