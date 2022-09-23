package hw1;

public class Bike extends Vehicle implements IRideable{

    public Bike(String name, int qty, Engine engine, float speed, double price) {
        super(name, qty, engine, speed, price);
    }

    @Override
    public void totalAfterTax(Vehicle bike) {
        System.out.println(totalBeforeTax(bike) + calcTax());

    }


    @Override
    public int milesPerHour() {
        return (int) this.getSpeed();
    }
}
