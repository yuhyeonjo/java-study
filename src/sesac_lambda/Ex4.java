package sesac_lambda;

interface A4 {
    int abc(String str);
}

public class Ex4 {

    public static void main(String[] args) {
/*
        1. 익명 이너 클래스 방법
        A4 a = new A4() {
            @Override
            public int abc(String str) {
                return Integer.parseInt(str);
            }
        };*/

        A4 a = (str) -> Integer.parseInt(str);
    }

}
