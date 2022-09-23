package hw1;

public class Horse extends Vehicle implements IRideable{

    public Horse(String name, int qty, double price, float speed) {
        super(name, qty, price, speed);
    }

    @Override
    public void totalAfterTax(Vehicle horse) {
        System.out.println(totalBeforeTax(horse) + calcTax());

    }

    @Override
    public int milesPerHour() {
        return (int) this.getSpeed();
    }
}
