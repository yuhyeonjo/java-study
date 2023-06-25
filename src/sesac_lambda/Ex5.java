package sesac_lambda;

interface A5 {
    double[] arr(int len);
}

public class Ex5 {

    public static void main(String[] args) {
/*
        A5 a = (int len) -> {
            return new double[len];
        };
*/
        A5 a1 = double[]::new;
    }
}
