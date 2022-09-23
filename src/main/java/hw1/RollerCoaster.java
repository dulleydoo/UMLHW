package hw1;

public class RollerCoaster implements IRideable {
    private final double tax = .20;
    private double price;
    private float speed;

    public RollerCoaster(double price, float speed) {
        this.price = price;
        this.speed = speed;
    }

    @Override
    public int milesPerHour() {
        return (int) this.speed;
    }
}
