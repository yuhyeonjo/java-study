package sesac_lambda;

interface A1 {
    int abc(String str);
}

public class Ex2 {

    public static void main(String[] args) {
        A1 a = new A1() {
            @Override
            public int abc(String str) {
                System.out.println(str.length());
                return str.length();
            }
        };


        a.abc("Hello Java");
    }

}

