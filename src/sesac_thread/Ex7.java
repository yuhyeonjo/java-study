package sesac_thread;

class MyThread2 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("첫 번째 출력");
            Thread.sleep(1000);
            System.out.println("두 번째 출력");
            Thread.sleep(1000);            
            System.out.println("세 번째 출력");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("쓰레드 종료");
        }
    }
}

public class Ex7 {
    public static void main(String[] args) {
        MyThread2 mt = new MyThread2();
        mt.start();
        try { Thread.sleep(1500); } catch (InterruptedException e) {}
        mt.interrupt();
    }
}
