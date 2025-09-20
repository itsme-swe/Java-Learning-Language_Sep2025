package mutlithreading;

class Data {

    int value;

    boolean flag = true;

    synchronized public void set(int val) {

        while (!flag) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }

        }
        this.value = val;
        flag = false;
        notify();

    }

    synchronized public int get() {

        int x = 0;

        while (flag) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }

        }
        x = value;
        flag = true;
        notify();
        return x;

    }
}

class Producer extends Thread {

    Data d;

    Producer(Data d1) {
        this.d = d1;
    }

    public void run() {

        int count = 1;
        while (true) {
            d.set(count);
            System.out.println("Producer " + count);
            count++;

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }
}

class Consumer extends Thread {

    Data d;

    Consumer(Data d2) {
        this.d = d2;
    }

    public void run() {

        int value;

        while (true) {
            value = d.get();
            System.out.println("Consumer " + value);

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class InterThreadCommunicationDemo {

    public static void main(String[] args) {

        Data d = new Data();

        Producer p = new Producer(d);

        Consumer c = new Consumer(d);

        p.start();
        c.start();
    }
}
