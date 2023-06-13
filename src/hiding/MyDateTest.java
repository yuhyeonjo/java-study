package hiding;

public class MyDateTest {

    public static void main(String[] args) {

        MyDate date = new MyDate();

    /*
        private 접근제어자로 변경 시 오류
        private 변수 public get/set 메서드를 이용하여 값 가져오기

        date.day = 13;
        date.month = 6;
        date.year = 2023;

     */

        date.setDay(13);
        date.setMonth(6);
        date.setYear(2023);

        date.showDate();
    }
}
