public class Country {
    // Properties

    private String name;
    private String capital;
    private double area;
    private double population;
    private double lowAltitude;
    private double highAltitude;
    private String continent;

    // Constructor
    Country(String name, String capital, double area, double population, double lowAltitude, double highAltitude,
            String continent) {
        this.name = name;
        this.capital = capital;
        this.area = area;
        this.population = population;
        this.lowAltitude = lowAltitude;
        this.highAltitude = highAltitude;
        this.continent = continent;
    }

    // Getter
    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public double getArea() {
        return area;
    }

    public double getPopulation() {
        return population;
    }

    public double getLowAltitude() {
        return lowAltitude;
    }

    public double gethighAltitude() {
        return highAltitude;
    }

    public String getContinent() {
        return continent;
    }

    // Setter

    public void setName(String name) {
        this.name = name;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public void setLowAltitude(double lowAltitude) {
        this.lowAltitude = lowAltitude;
    }

    public void setHightAltitude(double highAltitude) {
        this.highAltitude = highAltitude;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    // Method

    public void printDetails() {
        System.out.println("Name of country: " + name);
        System.out.println("Capital: " + capital);
        System.out.println("Area: " + area);
        System.out.println("Population: " + population);
        System.out.println("Low Altitude: " + lowAltitude);
        System.out.println("High Altitude: " + highAltitude);
        System.out.println("Continent: " + continent);
    }
}
