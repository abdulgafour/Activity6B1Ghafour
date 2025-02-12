public class carz extends Vehicle {
    private String model;

    // Constructor
    public Car(String model) {
        super("Car"); // Call the superclass constructor
        this.model = model;
    }

    // Honk the horn
    public void honk() {
        System.out.println(model + " is honking! Beep Beep!");
    }

    // Display car details
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Current Speed: " + getSpeed() + " km/h");
    }
}