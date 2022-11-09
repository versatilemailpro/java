import java.util.ArrayList;

public class Nepal extends Country {

    private String nationalAnimal;
    private ArrayList<String> temples;

    // Constructor
    Nepal(String name, String capital, double area, double population, double lowAltitude, double highAltitude,
            String continent, String nationalAnimal, ArrayList<String> temples) {
        super(name, capital, area, population, lowAltitude, highAltitude, continent);
        this.nationalAnimal = nationalAnimal;
        this.temples = temples;
    }

    // Getter

    public String getNationalAnimal() {
        return nationalAnimal;
    }

    // Setter

    public void setNationalAnimal(String nationalAnimal) {
        this.nationalAnimal = nationalAnimal;
    }

    // Method
    public void printDetails() {
        super.printDetails();
        System.out.println("National Animal: " + nationalAnimal);

        String countryTemples = "";
        for (String temple : temples) {
            countryTemples = countryTemples + temple + ", ";
        }

        System.out.println("Temples: " + countryTemples + "etc.");
    }

}
