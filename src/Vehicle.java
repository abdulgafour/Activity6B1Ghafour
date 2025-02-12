// Vehicle.java
public class Vehicle {
    private int speed;

    // Constructor
    public Vehicle() {
        this.speed = 0;
    }

    // Accelerate the vehicle
    public void accelerate(int increment) {
        speed += increment;
        System.out.println("Car is accelerating. Current speed: " + speed + " km/h");
    }

    // Decelerate the vehicle
    public void decelerate(int decrement) {
        speed -= decrement;
        if (speed < 0) speed = 0;
        System.out.println("Car is decelerating. Current speed: " + speed + " km/h");
    }

    // Honk the horn
    public void honk() {
        System.out.println("Car is honking! Beep Beep!");
    }

    // Park the car
    public void park() {
        System.out.println("Car is parked.");
    }
}