package mutlithreading;

class MyTh extends Thread {

    public MyTh(String name) {
        super(name);    // calling constructor of parent class Thread
        setPriority(Thread.MAX_PRIORITY);
    }

    public void run() {
    }

    ;
}

public class ThreadMethodsDemo {

    public static void main(String[] args) throws Exception {

        MyTh mt = new MyTh("MyThread1");

        System.out.println(mt.threadId());  // 24

        System.out.println(mt.getName());   // MyThread1

        System.out.println(mt.getPriority());   // 5

        System.out.println(mt.getState());  // new


    }
}
