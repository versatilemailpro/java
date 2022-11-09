import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> temples = new ArrayList<String>();

        temples.add("Pashupati Nath Temple");
        temples.add("Syambhu Nath");
        temples.add("Changunarayan");
        temples.add("Bouddha Nath");
        temples.add("BudanilKantha");

        Nepal nepal = new Nepal("Nepal", "Kathmandu", 147181, 30000000, 60, 8848.68, "Asia", "Cow", temples);

        nepal.printDetails();
        System.out.println();

        India india = new India("India", "New Delhi", 500000, 1000000000, 1, 3000, "Asia", "Bengal Tiger");

        india.printDetails();
        System.out.println();

        Usa usa = new Usa("United States of america", "Washington DC", 300000, 4000000, 20, 2000, "North America",
                2000000000);

        usa.printDetails();
    }
}