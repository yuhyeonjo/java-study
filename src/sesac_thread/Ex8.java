package sesac_thread;

class MyData2 {
    synchronized void printA() {
        boolean flag = false;
        if(flag) {
           try { wait(); } catch (InterruptedException e) {} // Waiting
        }
        System.out.println("A");
        flag = true;
        notify();
    }

    synchronized void printB() {
        boolean flag = false;
        if(flag) {
            try { wait(); } catch (InterruptedException e) {} // Waiting
        }
        System.out.println("B");
        flag = true;
        notify();
    }
}

class ThreadA extends Thread {
    MyData2 myData;
    public ThreadA (MyData2 myData) {
        this.myData = myData;
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            myData.printA();
            try { Thread.sleep(500);} catch(InterruptedException e) {}
        }
    }
}

class ThreadB extends Thread {
    MyData2 myData;
    public ThreadB (MyData2 myData) {
        this.myData = myData;
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            myData.printB();
            try { Thread.sleep(500);} catch(InterruptedException e) {}
        }
    }
}

public class Ex8 {
    public static void main(String[] args) {
        MyData2 myData2 = new MyData2();
        Thread t1 = new ThreadA(myData2);
        Thread t2 = new ThreadB(myData2);

        t1.start();
        t2.start();
    }
}
