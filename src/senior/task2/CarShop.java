package senior;

public class CarShop {
    private Car car;

    public CarShop(Car car) {
        this.car = car;
    }

    public void sellCar() {
        try {
            System.out.println("Здравствуй клиент, цена этого авто: \n" + car.getPrice());
            System.out.println("Хочешь купить авто?");
        } catch (PriceException e) {
            System.out.println("Здравствуй клиент, цена этого авто: \n" + e.getMessage());
            System.out.println("Давайте посмотрим другое авто?");
        }
    }
}
