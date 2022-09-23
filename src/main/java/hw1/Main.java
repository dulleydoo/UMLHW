package hw1;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(8);
        Car car = new Car("Mercedes",1, engine, 65, 1000.00);
        Bike bike = new Bike("GXR", 1, engine, 120, 500.00);
        Horse horse = new Horse("Ace", 1, 100, 55 );
        Truck truck = new Truck("Truck", 1, engine, 65, 2500);
        RollerCoaster rollerCoaster = new RollerCoaster(5, 135);

        Vehicle[] vehicles = {car, bike, horse, truck};
        IRideable[] rideables = {horse, rollerCoaster, bike};
        VehicleApp.printVehiclesNamesAndPrices(vehicles);
        VehicleApp.getSpeedOfRideableObjects(rideables);

       for (Vehicle i: vehicles){
            System.out.println(i.totalBeforeTax(vehicles[3]));
        }
        for (Vehicle i: vehicles){
            i.totalAfterTax(vehicles[3]);
        }




    }
}
