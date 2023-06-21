package staticex;

import java.util.Calendar;
import java.util.spi.CalendarNameProvider;

public class CompanyTest {

    public static void main(String[] args) {

        /*
        private으로 되어있어 불가능 유일한 객체를 참조 할 수 있는 메서드 불러야함
       Company company = new Company();
         */

        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1); // staticex.Company@6a5fc7f7
        System.out.println(company2); // staticex.Company@6a5fc7f7

        // 자주본 Calendar도 싱글톤을 사용한 것
        Calendar calendar = Calendar.getInstance();

    }
}
