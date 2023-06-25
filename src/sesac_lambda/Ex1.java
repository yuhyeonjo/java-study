package sesac_lambda;

interface A {
    void abc(double k);
}

public class Ex1 {
    public static void main(String[] args) {
        // 익명 이너 클래스
        A a = (k) -> System.out.println(k + 0.5);
        a.abc(3.8);
    }
}
