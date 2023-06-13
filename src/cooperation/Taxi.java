package cooperation;

public class Taxi {

    int taxiNumber;
    int money;

    public Taxi(int taxiNumber) {
        this.taxiNumber = taxiNumber;
    }

    public void takeTaxi(int money) {
         this.money = money;
    }

    public void showTaxiInfo() {
        System.out.println( taxiNumber + "택시의 수입은 " + money + "원 입니다.");
    }
}
