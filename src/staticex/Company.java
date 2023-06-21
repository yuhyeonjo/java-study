package staticex;

public class Company {

    private static Company instance = new Company();

    // 생성자를 private로 생성
    private Company() {}

    public static Company getInstance() {
        if(instance == null) {
            instance = new Company();
        }
        return instance;
    }


}
