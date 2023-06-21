package staticex;

public class CardCompanyTest {

    public static void main(String[] args) {
        // 싱글톤 패턴
        CardCompany company = CardCompany.getInstance();

        // 메서드에서 Car 생성
        Card myCard = company.createCard();
        System.out.println(myCard);
        Card yourCard = company.createCard();
        System.out.println(yourCard);

        System.out.println(myCard.getCardNumber()); // 10001 출력
        System.out.println(yourCard.getCardNumber()); // 10002 출력
    }
}
