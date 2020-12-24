package exercise39Polymorphism;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.printf("\n The " + getName() + " engine is starting...");

    }

    @Override
    public void accelerate() {
        System.out.printf("\n The " + getName() + " is accelerating");
    }

    @Override
    public void brake() {
        System.out.printf("\n The " + getName() + " is braking");
    }
}
