package Generics_Challenge;

public class Team {

    private String name;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override // had to override this so the arraylist shows the names in League Class
    public String toString() {
        return ("Team name: "+this.name);
    }
}
