package InherantanceChallenge88;

public class Car extends Vehicle {

    private String motor;
    private String liecencelate;
    private int numberDoor;
    private String typeofcar;

    public Car(  String motor, String liecencelate, int numberDoor, String typeofcar) {
        super(4, "Blue");
        this.motor = motor;
        this.liecencelate = liecencelate;
        this.numberDoor = numberDoor;
        this.typeofcar = typeofcar;
    }

    public void honklikeaCar(){
        System.out.printf("honk like a car method called! \n");
    }

    public void whatamI(){
        System.out.println("what am i called! i am a car! \n");
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getLiecencelate() {
        return liecencelate;
    }

    public void setLiecencelate(String liecencelate) {
        this.liecencelate = liecencelate;
    }

    public int getNumberDoor() {
        return numberDoor;
    }

    public void setNumberDoor(int numberDoor) {
        this.numberDoor = numberDoor;
    }

    public String getTypeofcar() {
        return typeofcar;
    }

    public void setTypeofcar(String typeofcar) {
        this.typeofcar = typeofcar;
    }
}

