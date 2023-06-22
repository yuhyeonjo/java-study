package array;

public class ArrayTest2 {

    public static void main(String[] args) {
        char[] chars = new char[26];

        for(int i = 65, j = 0; j < chars.length; i++, j++){
            chars[j] = (char)i;
        }

        for(char ch : chars) {
            System.out.println(ch);
        }



    }
}
