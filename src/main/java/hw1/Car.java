package hw1;

public class Car extends Vehicle{

    public Car(String name, int qty, Engine engine, float speed, double price) {
        super(name, qty, engine, speed, price);
    }

    @Override
    public void totalAfterTax(Vehicle car) {
        System.out.println(totalBeforeTax(car) + calcTax());
    }
}
