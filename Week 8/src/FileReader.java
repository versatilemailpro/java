import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class FileReader {

    public static void main(String[] args) {
        try {

            String path = "PersonalDetails.txt";

            File f = new File(path);

            Scanner sc = new Scanner(f);
            ArrayList<Person> persons = new ArrayList<>();

            while (sc.hasNextLine()) {
                String text = sc.nextLine();

                String[] list = text.split(",");
                persons.add(new Person(list[0], Integer.parseInt(list[1]), list[2]));
            }

            for (Person p : persons) {
                p.display();
            }

            FileWriter fileWriter = new FileWriter(path);
            for (Person p : persons) {
                fileWriter.write(p.toString() + "\n");
            }
            fileWriter.close();

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

    }
}
