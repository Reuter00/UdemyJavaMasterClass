package Generics_Challenge;


import java.util.ArrayList;
import java.util.Arrays;

public class League<T extends Team> {

    private String name;
    private ArrayList<T> teamArray = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public  Boolean addTeam(T team){

        if(teamArray.contains(team)){
            System.out.println( team.getName() + " is already in " + this.name);
            return false;
        }else{
            teamArray.add(team);
            System.out.println( team.getName() + " was added to  " + this.name);
            return true;
        }

    }

    public ArrayList<T> getTeamArray() {
        return teamArray;
    }

    public void printLeague(){
        System.out.println("\n" + this.getName() + " teams: ");
        for (T element : teamArray) {
            System.out.println(element.getName());
        }
    }
}
