public class Parking {
    private String location;

    // Constructor
    public Parking(String location) {
        this.location = location;
    }

    // Park the vehicle
    public void parkVehicle(Vehicle vehicle) {
        vehicle.stop();
        System.out.println("Vehicle is parked at " + location);
    }

    // Unpark the vehicle
    public void unparkVehicle(Vehicle vehicle) {
        System.out.println("Vehicle is unparked from " + location);
        vehicle.accelerate(10); // Start moving after unparking
    }
}