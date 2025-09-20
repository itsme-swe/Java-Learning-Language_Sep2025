package mutlithreading;

class MyData {

    public void display(String str) {

        synchronized (this) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i) + " ");
            }
        }
    }
}

class MyThread1 extends Thread {

    MyData d;   // ref. of class MyData

    public MyThread1(MyData data) {
        this.d = data;
    }

    public void run() {
        d.display("Hello World ");
    }
}

class MyThread2 extends Thread {

    MyData d;   // ref. of class MyData

    public MyThread2(MyData data) {
        this.d = data;
    }

    public void run() {
        d.display("Welcome All!!");
    }
}

public class SynchronizationDemo {

    public static void main(String[] args) {

        MyData data = new MyData();

        MyThread1 t1 = new MyThread1(data);

        MyThread2 t2 = new MyThread2(data);

        t1.start();
        t2.start();
    }
}
