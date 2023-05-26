public class MyThread implements Runnable {
    Thread thread;

    MyThread(String name) {
        thread = new Thread(this, name);
    }

    public static MyThread createAndStart(String name) {
        MyThread myThread = new MyThread(name);
        myThread.thread.start();
        return myThread;
    }

    public void run() {
        System.out.println(thread.getName() + " starts to operate");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(100);
                System.out.println(thread.getName() + " is executing, the counter value: " + count);
            }
        } catch (InterruptedException e) {
            System.out.println(thread.getName() + " has been interrupted");
        }
        System.out.println(thread.getName() + " finishes running.");
    }
}

class MoreThread2 {
    public static void main(String[] args) {
        System.out.println("The main thread starts running.");
        MyThread myThread1 = MyThread.createAndStart("Child thread # 1");
        MyThread myThread2 = MyThread.createAndStart("Child thread # 2");
        MyThread myThread3 = MyThread.createAndStart("Child thread # 3");

        try {
            myThread1.thread.join();
            myThread2.thread.join();
            myThread3.thread.join();
        } catch (InterruptedException e) {
            System.out.println("The main thread has been interrupted");
        }

        System.out.println("The main thread is exiting.");
    }
}