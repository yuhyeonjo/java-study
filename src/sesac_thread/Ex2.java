package sesac_thread;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            System.out.println(i + "초");
        }
    }
}

public class Ex2 {

    public static void main(String[] args) {
        // MyRunnable 객체를 이용한 쓰레드의 실행
        MyRunnable myRunnable = new MyRunnable();
        myRunnable.run();
    }
}
