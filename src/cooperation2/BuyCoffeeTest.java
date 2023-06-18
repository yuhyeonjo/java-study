package cooperation2;

public class BuyCoffeeTest {

    public static void main(String[] args) {

        Person p1 = new Person("김졸려", 20000);
        Person p2 = new Person("이피곤", 10000);

        Coffee starBuck = new Coffee("스타벅스", "아메리카노", 4000);
        Coffee KongCafe = new Coffee("콩카페", "라떼", 4500);

        p1.buyCoffee(starBuck);
        p2.buyCoffee(KongCafe);



    }
}