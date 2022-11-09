public class India extends Country {
    private String nationalAnimal;

    // Constructor
    India(String name, String capital, double area, double population, double lowAltitude, double highAltitude,
            String continent, String nationalAnimal) {
        super(name, capital, area, population, lowAltitude, highAltitude, continent);
        this.nationalAnimal = nationalAnimal;
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
    }
}
