package _153_Collection_Overview;


public class Main {
    public static void main(String[] args) {
Theatre theatre = new Theatre("Olympian",8,12);
// theatre.getSeats(); Shows all seats
if (theatre.reserveSeat("D14")){
    System.out.println("Please pay");
}else {
    System.out.println("Sorry, seat is taken");
}
//        if (theatre.reserveSeat("H11")){
//            System.out.println("Please pay");
//        }else {
//            System.out.println("Sorry, seat is taken");
//        }

    }
}