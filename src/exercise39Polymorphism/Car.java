package exercise39Polymorphism;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }

    public void startEngine(){
        System.out.printf("\n The car engine is starting...");
    }

    public void accelerate(){
        System.out.printf("\n The car is accelerating");
    }

    public void brake(){
        System.out.printf("\n The car is braking");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
