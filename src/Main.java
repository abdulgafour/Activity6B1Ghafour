// Main.java
public class Main {
    public static void main(String[] args) {
        // Create a Vehicle object
        Vehicle myCar = new Vehicle();

        // Test the functionality
        myCar.accelerate(50); // Accelerate by 50 km/h
        myCar.honk();         // Honk the horn
        myCar.decelerate(20);  // Decelerate by 20 km/h
        myCar.park();          // Park the car
    }
}