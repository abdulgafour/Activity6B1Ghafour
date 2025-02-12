public class Vehicle {
    private String type;
    private int speed;

    // Constructor
    public Vehicle(String type) {
        this.type = type;
        this.speed = 0;
    }

    // Accelerate the vehicle
    public void accelerate(int increment) {
        speed += increment;
        System.out.println(type + " is accelerating. Current speed: " + speed + " km/h");
    }

    // Decelerate the vehicle
    public void decelerate(int decrement) {
        speed -= decrement;
        if (speed < 0) speed = 0;
        System.out.println(type + " is decelerating. Current speed: " + speed + " km/h");
    }

    // Stop the vehicle
    public void stop() {
        speed = 0;
        System.out.println(type + " has stopped. Current speed: " + speed + " km/h");
    }

    // Get current speed
    public int getSpeed() {
        return speed;
    }
}