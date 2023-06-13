package cooperation;

public class Student {

    String studentName;
    int grade;
    int money;

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.takeBus(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway) {
        subway.takeSubway(1200);
        this.money -= 1200;
    }

    public void takeTaxi(Taxi taxi) {
        taxi.takeTaxi(taxi.money);
        this.money -= taxi.money;
    }

    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다");
    }


}
