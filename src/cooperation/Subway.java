package cooperation;

public class Subway {

    int subwayNumber;
    int passengerCount;
    int money;

    public Subway(int subwayNumber) {
        this.subwayNumber = subwayNumber;
    }

    public void takeSubway(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showSubwayInfo() {
        System.out.println( subwayNumber + "버스의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
    }
}
