package hw1;

public abstract class Vehicle extends Product {
    private int qty;
    private double price;
    private Engine engine;
    private final double tax = .15;
    private float speed;


    public Vehicle(String name, int qty, Engine engine, float speed, double price) {
        super(name);
        this.qty = qty;
        this.engine = engine;
        this.speed = speed;
        this.price = price;
    }
    public Vehicle(String name, int qty, double price, float speed){
        super(name);
        this.qty = qty;
        this.speed = speed;
        this.price = price;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public double getTax() {
        return tax;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public double totalBeforeTax(Vehicle vehicle){
        return price * qty;
    }

    public double calcTax(){
       return price * qty * tax;
    }

    public abstract void totalAfterTax(Vehicle vehicle);


}
