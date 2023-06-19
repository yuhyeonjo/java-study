package sesac_thread;

class MyThread extends Thread {

    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            System.out.println(i + "초");
        }
    }
}

class Ex1 {
    public static void main(String[] args) {
        // MyThread 객체를 이용한 쓰레드의 실행
        MyThread thread1 = new MyThread();
        thread1.start();
    }
}

