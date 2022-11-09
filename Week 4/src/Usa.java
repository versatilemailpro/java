public class Usa extends Country {
    private double gdp;

    // Constructor
    Usa(String name, String capital, double area, double population, double lowAltitude, double highAltitude,
            String continent, double gdp) {
        super(name, capital, area, population, lowAltitude, highAltitude, continent);
        this.gdp = gdp;
    }

    // Getter

    public double getGdp() {
        return gdp;
    }

    // Setter

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }

    // Method
    public void printDetails() {
        System.out.println("Gdp: " + gdp);
    }
}
