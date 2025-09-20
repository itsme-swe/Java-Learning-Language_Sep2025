package mutlithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAcc_xxx {

    private final Lock lk = new ReentrantLock();

    private int balance = 1000;

    public void withdraw(int amount) {

        System.out.println(Thread.currentThread().getName() + "Attempting to withdraw " + amount);

        try {
            if (lk.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + "Proceeding with withdrawals");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + "Completed Withdrawal..Balance Remaining: " + balance);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lk.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + "Insufficient balance!!!");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + "Could not acquire the lock, will try later!!!");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }

}

public class ExplicitLockDemo {

    public static void main(String[] args) {

        BankAcc_xxx SBIAc = new BankAcc_xxx();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                SBIAc.withdraw(100);
            }
        };

        Thread t1 = new Thread(task, "Thread_1");
        Thread t2 = new Thread(task, "Thread_2");

        t1.start();
        t2.start();
    }
}
