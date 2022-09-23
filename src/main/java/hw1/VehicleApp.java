package hw1;

public class VehicleApp {
    public static void printVehiclesNamesAndPrices(Vehicle [] vehicles) {
        for (int i = 0; i < vehicles.length;i++ )
        System.out.println(vehicles[i].getName()+" "+vehicles[i].getPrice());
    }
    public static void getSpeedOfRideableObjects(IRideable[] rideables){
        for (int i = 0; i < rideables.length;i++ )
            System.out.println(rideables[i].milesPerHour());
    }

}
