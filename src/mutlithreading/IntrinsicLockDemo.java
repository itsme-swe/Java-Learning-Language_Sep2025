package mutlithreading;

class BankAccount {

    private int balance = 1000;

    public synchronized void withdraw(int amt) {
        System.out.println(Thread.currentThread().getName() + "Attempting to withdraw " + amt);

        if (balance >= amt) {
            System.out.println(Thread.currentThread().getName() + "Proceeding with withdrawals");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            balance -= amt;
            System.out.println(Thread.currentThread().getName() + "Completed Withdrawal..Balance Remaining: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + "Insufficient balance...");
        }
    }
}

public class IntrinsicLockDemo {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();

        // anonymous class
        Runnable task = new Runnable() {
            @Override
            public void run() {
                b1.withdraw(50);
            }
        };

        // passing Runnable obj(task) to Thread Class constructor
        Thread t1 = new Thread(task, "Thread_1");
        Thread t2 = new Thread(task, "Thread_2");

        t1.start();
        t2.start();
    }
}
