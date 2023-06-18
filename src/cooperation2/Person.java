package cooperation2;

public class Person {

    private String name;
    private int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void buyCoffee(Coffee coffee) {
        coffee.buyCoffee(coffee.CoffeePrice);
        this.money -= coffee.CoffeePrice;
        System.out.print(name + "님 산 커피는 " + coffee.CoffeeBrand + " " + coffee.CoffeeName + ", 가격은 " + coffee.CoffeePrice + "원입니다. ");
        System.out.println("지갑에 남아있는 돈은 " + money + "원입니다.");

    }
}

