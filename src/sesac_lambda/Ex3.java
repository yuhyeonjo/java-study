package sesac_lambda;

interface A3 {
    double abc(int k);
}

class B {
    double bcd(int k) {
        return k * 0.1;
    }
}

public class Ex3 {

    public static void main(String[] args) {
/*
        1. 익명 이너 클래스 방법
        A3 a = new A3() {
            @Override
            public double abc(int k) {
                B b = new B();
                return b.bcd(k);
            }
        };*/

        // 2. 람다식 문법 사용
        A3 a = (k) -> {
            B b = new B();
            return b.bcd(k);
        };

    }
}
