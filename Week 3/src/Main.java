import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> skills = new ArrayList<String>();

        skills.add("Dribbler");
        skills.add("Header");
        skills.add("Shooter");

        Player p1 = new Player("Cristiano Ronaldo", 39, 7, 183, "Striker", skills, 1000000);

        System.out.println();

        // Clear previous skills
        skills.clear();

        skills.add("Tackler");
        skills.add("Pacer");
        skills.add("Shooter");
        skills.add("Passer");

        Player p2 = new Player("Leonel Messi", 35, 30, 160, "Right Winger", skills, 5000000);

        System.out.println();

        // Player 3

        skills.clear();
        skills.add("Poacher");
        skills.add("Tackler");
        skills.add("Pacer");

        Player p3 = new Player("Neymar Jr.", 32, 10, 170, "Striker", skills, 1000000);

        ArrayList<Player> team = new ArrayList<Player>();

        team.add(p2);
        team.add(p3);
        Team team1 = new Team("PSG", "1980", team);
        team1.printAll();

        System.out.println();

        team.clear();
        team.add(p1);
        Team team2 = new Team("Manchester United", "1950", team);

        team2.printAll();

    }
}
