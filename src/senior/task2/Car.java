package senior;

public class Car {
    private double price;

    public Car(double price) {
        this.price = price;
    }

    public double getPrice() throws PriceException {
        if (price < 0) {
            throw new PriceException("Неизвестна мне");
        }
        return price;
    }
}
