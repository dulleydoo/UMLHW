package hw1;

public class Truck extends Vehicle{

    public Truck(String name, int qty, Engine engine, float speed, double price) {
        super(name, qty, engine, speed, price);
    }

    @Override
    public void totalAfterTax(Vehicle truck) {
        System.out.println(totalBeforeTax(truck) + calcTax());

    }

}
