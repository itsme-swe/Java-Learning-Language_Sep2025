package mutlithreading;

public class MultithreadingUsingRunnableInterface implements Runnable {

    public static void main(String[] args) {

        MultithreadingUsingRunnableInterface t = new MultithreadingUsingRunnableInterface();    // object of Runnable

        Thread th = new Thread(t);  // object of Thread

        th.start();


        int i = 1;
        while (true) {
            System.out.println(i + "World");
            i++;

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                break;
            }
        }

    }

    public void run() {

        int i = 1;

        while (true) {
            System.out.println(i + "Hello");
            i++;

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}
