package mutlithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {

    private final Lock lock = new ReentrantLock();

    public void outerMethod() {
        lock.lock();

        try {
            System.out.println("Outer Method!!");

        } finally {
            lock.unlock();
        }
    }

    public void innerMethod() {
        lock.lock();

        try {
            System.out.println("Inner Method!!!");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {

        ReentrantLockDemo rlk = new ReentrantLockDemo();

        rlk.outerMethod();
    }

}

// op: Outer Method!!