package cooperation;

public class TakeTransTest {

    public static void main(String[] args) {
        Student s1 = new Student("Lee", 20000);
        Student s2 = new Student("Kim", 10000);
        Student s3 = new Student("Jo", 100000);

        Bus b1 = new Bus(163);
        Bus b2 = new Bus(100);

        Subway subway1 = new Subway(2);
        Subway subway2 = new Subway(4);

        Taxi taxi1 = new Taxi(3434);
        taxi1.money = 10000;

        s1.takeBus(b1);
        s2.takeSubway(subway2);
        s3.takeTaxi(taxi1);


        s1.showInfo();
        s2.showInfo();
        s3.showInfo();


        b1.showBusInfo();
        subway2.showSubwayInfo();
        taxi1.showTaxiInfo();
    }
}
