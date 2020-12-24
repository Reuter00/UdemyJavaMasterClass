package InherantanceChallenge88;

public class Van extends Car{

    private int numberofSeats;

    public Van(String motor, String liecencelate, int numberDoor, String typeofcar, int numberofSeats) {
        super(motor, liecencelate, numberDoor, typeofcar);
        this.numberofSeats = numberofSeats;
    }

    @Override
    public void honklikeaCar() {
        System.out.println("honk like a car called but i am a VAN!");
    }

    @Override
    public void whatamI() {
        super.whatamI();
    }

    public int getNumberofSeats() {
        return numberofSeats;
    }
}
