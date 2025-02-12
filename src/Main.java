public class Main {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota Corolla");

        // Test Car functionality
        myCar.displayDetails();
        myCar.accelerate(50);
        myCar.honk();
        myCar.decelerate(20);
        myCar.stop();

        // Test Parking functionality
        Parking parkingLot = new Parking("Downtown Parking");
        parkingLot.parkVehicle(myCar);
        parkingLot.unparkVehicle(myCar);
    }
}