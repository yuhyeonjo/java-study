package classpart;

public class OrderTest {

    public static void main(String[] args) {

        Order order1 = new Order();
        order1.OrderNum = 201907210001L;
        order1.OrderID = "abc123";
        order1.UserName = "홍길순";
        order1.OrderDate = "2019년 7월 21일";
        order1.ProductName = "PD0345-12";
        order1.address = "서울시 영등포구 여의도동 20번지";

        System.out.println(order1);
    }
}
