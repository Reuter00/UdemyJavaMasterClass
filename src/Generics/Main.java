package Generics;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<SoccerPlayer> soccerTeam = new Team<>("Juventos");

        //juventos.addPlayer(joe);
    //   juventos.addPlayer(pat);
        soccerTeam.addPlayer(beckham);

        System.out.println(soccerTeam.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicaco Cubs");
        baseballTeam.addPlayer(pat);
        Team<FootballPlayer> footballTeam =new Team<>("Manchester");
        footballTeam.addPlayer(joe);
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(footballTeam, 3, 8);

        footballTeam.matchResult(fremantle, 2, 1);
       // soccerTeam.matchResult(baseballTeam, 1, 1);

        System.out.println("Rankings");
        System.out.println(footballTeam.getName() + ":" + footballTeam.ranking());
        System.out.println(fremantle.getName() + ":" + fremantle.ranking());
        System.out.println(hawthorn.getName() + ":" + hawthorn.ranking());
        System.out.println(melbourne.getName() + ":" + melbourne.ranking());

        System.out.println(fremantle.compareTo(hawthorn));
        System.out.println(fremantle.compareTo(melbourne));
    }
}
