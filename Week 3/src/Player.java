import java.util.ArrayList;

public class Player {

    // Properties

    public String name;
    public int age;
    public int number;
    public double height;
    public String position;
    public ArrayList<String> skills;
    public double wage;

    // Constructor
    Player(String name, int age, int number, double height, String position, ArrayList skills, double wage) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.height = height;
        this.position = position;
        this.skills = skills;
        this.wage = wage;
    }

    // Method
    public void printDetails() {

        System.out.println("Player's name: " + this.name);
        System.out.println(this.name + "'s age: " + this.age);
        System.out.println(this.name + "'s Jersey number: " + this.number);
        System.out.println(this.name + "'s height: " + this.height);
        System.out.println(this.name + "'s position: " + this.position);

        for (String info : skills) {
            System.out.println(this.name + "'s skills: " + info);
        }
        System.out.println(this.name + "'s wage: " + this.wage);
    }

}
