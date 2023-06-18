package cooperation2;

public class Coffee {

    String CoffeeBrand;
    String CoffeeName;
    int CoffeePrice;

    public Coffee(String coffeeBrand, String coffeeName, int price) {
        CoffeeBrand = coffeeBrand;
        CoffeeName = coffeeName;
        this.CoffeePrice = price;
    }

    public String getCoffeeBrand() {
        return CoffeeBrand;
    }

    public void setCoffeeBrand(String coffeeBrand) {
        CoffeeBrand = coffeeBrand;
    }

    public String getCoffeeName() {
        return CoffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        CoffeeName = coffeeName;
    }

    public int getCoffeePrice() {
        return CoffeePrice;
    }

    public void setCoffeePrice(int coffeePrice) {
        this.CoffeePrice = coffeePrice;
    }

    public void buyCoffee(int coffeePrice) {
        this.CoffeePrice = coffeePrice;
    }
}
