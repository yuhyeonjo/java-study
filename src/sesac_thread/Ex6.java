package sesac_thread;

class MyData1 {
    String name = "홍길동";

    synchronized void abc() {
    }

    void bcd() {
        synchronized (this) {
            System.out.println(this);
        }
    }

    void cde() {
        synchronized (name) {
            System.out.println(name);
        }
    }
}

public class Ex6 {
    public static void main(String[] args) {
        MyData1 myData1 = new MyData1();

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                myData1.abc();
                myData1.bcd();
                myData1.cde();
            }
        };

        Thread thread2 = new Thread(){
            @Override
            public void run() {
                myData1.bcd();
                myData1.cde();
                myData1.abc();
            }
        };
    }
}
