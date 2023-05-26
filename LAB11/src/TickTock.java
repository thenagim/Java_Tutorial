public class TickTock {
    boolean ticked; // flag to track the clock state

    synchronized void tick(boolean running) {
        if (!running) { // stopping the clock
            ticked = true;
            notify(); // notify the waiting thread
            return;
        }
        System.out.println("tik");

        // wait for half a second
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("The thread has been interrupted");
        }

        ticked = true; // set ticked flag to true
        notify(); // allows execution of the tock() method

        try {
            while (ticked)
                wait(); // wait for tock() to complete
        } catch (InterruptedException e) {
            System.out.println("The thread has been interrupted");
        }
    }

    synchronized void tock(boolean running) {
        if (!running) { // stopping the clock
            ticked = false;
            notify(); // notify the waiting thread
            return;
        }
        System.out.println("tak");

        // wait for half a second
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("The thread has been interrupted");
        }

        ticked = false; // set ticked flag to false
        notify(); // allows execution of the tick() method
    }
}

class MyThreadClock implements Runnable {
    Thread thread;
    TickTock tt;

    MyThreadClock(String name, TickTock tt) {
        thread = new Thread(this, name);
        this.tt = tt;
    }

    public static MyThreadClock createAndStart(String name, TickTock tt) {
        MyThreadClock myThreadClock = new MyThreadClock(name, tt);
        myThreadClock.thread.start();
        return myThreadClock;
    }

    public void run() {
        if (thread.getName().equals("tik")) {
            for (int i = 0; i < 10; i++) {
                tt.tick(true);
                tt.tock(true);
            }
            tt.tick(false);
        } else {
            for (int i = 0; i < 10; i++) {
                tt.tock(true);
                tt.tick(true);
            }
            tt.tock(false);
        }
    }
}

class ThreadCom {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        MyThreadClock myThreadClock1 = MyThreadClock.createAndStart("tik", tt);
        MyThreadClock myThreadClock2 = MyThreadClock.createAndStart("tak", tt);
        try {
            myThreadClock1.thread.join();
            myThreadClock2.thread.join();
        } catch (InterruptedException e) {
            System.out.println("The main thread has been interrupted");
        }
    }
}