package sesac_lambda;

interface A7 {
    void abc(B7 b, int k);
}

class B7 {
    void bcd(int k) {
        System.out.println(k);
    }
}

public class Ex7 {
    public static void main(String[] args) {
        A7 a = B7::bcd;
        B7 b = new B7();
        a.abc(b, 3); //3
    }
}
