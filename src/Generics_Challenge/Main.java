package Generics_Challenge;

public class Main {
    public static void main(String[] args) {

        BaseballTeam bt1 = new BaseballTeam("Socks");
        BaseballTeam bt2 = new BaseballTeam("Shirts");
        FootballTeam ft1 = new FootballTeam("Bulls");
        FootballTeam ft2 = new FootballTeam("Cows");
        SoccerTeam st1 = new SoccerTeam("AC Milan");
        SoccerTeam st2 = new SoccerTeam("Juventos");

        League<SoccerTeam> soccerTeamLeague = new League<>("UEFA");
        League<BaseballTeam> baseballTeamLeague = new League<>("BaseballLeague");
        League<FootballTeam> footballTeamLeague = new League<>("Super Ball");


        soccerTeamLeague.addTeam(st1);
        soccerTeamLeague.addTeam(st2);
        soccerTeamLeague.addTeam(st1);

        baseballTeamLeague.addTeam(bt1);
        baseballTeamLeague.addTeam(bt2);
        baseballTeamLeague.addTeam(bt1);

        footballTeamLeague.addTeam(ft1);
        footballTeamLeague.addTeam(ft2);
        footballTeamLeague.addTeam(ft1);

        soccerTeamLeague.printLeague();
        baseballTeamLeague.printLeague();
        footballTeamLeague.printLeague();

    }
}
