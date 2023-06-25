package sesac_lambda;

interface A6 {
    B6 abc(int a, double b);
}

class B6 {
    B6() {
        System.out.println("첫 번째 생성자");
    }

    B6(int a) {
        System.out.println("두 번째 생성자");
    }
    
    B6(int a, double b){
        System.out.println("세 번째 생성자");
    }
}

public class Ex6 {
    public static void main(String[] args) {
        B6 b = new B6(3,3.3);
    }
}
