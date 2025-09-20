package mutlithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LocksFairnessDemo {

    private final Lock lock = new ReentrantLock(true);  // This is how we make thread fair by passing true parameter

    public void accessResource() {

        lock.lock();

        try {
            System.out.println(Thread.currentThread().getName() + " acquired the Lock");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(Thread.currentThread().getName() + " release the lock.");
            lock.unlock();
        }
    }

    public static void main(String[] args) {

        LocksFairnessDemo lf = new LocksFairnessDemo();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                lf.accessResource();
            }
        };

        Thread t1 = new Thread(task, "Thread_1");

        Thread t2 = new Thread(task, "Thread_2");

        Thread t3 = new Thread(task, "Thread_3");

        try {
            t1.start();
            Thread.sleep(50);

            t2.start();
            Thread.sleep(50);

            t3.start();
            Thread.sleep(50);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
