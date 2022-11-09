import java.util.ArrayList;

public class TryCatch {
    public static void main(String[] args) {

        try {
            ArrayList<String> cities = new ArrayList<>();

            cities.add("Kathmandu");
            cities.add("Los Angeles");
            cities.add("rio de jenerio");
            cities.add("madrid");

            System.out.println(cities.get(1));
            System.out.println("The size of array is " + cities.size());

            cities.add("Kalimanjaro");
            System.out.println(cities.get(4));
            System.out.println("The size of array is " + cities.size());

            System.out.println(cities.get(7));
            System.out.println("The size of array is " + cities.size());

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            display();
        }

    }

    public static void display() {
        System.out.println("Well done");
    }

}
