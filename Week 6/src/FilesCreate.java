import java.io.File;

public class FilesCreate {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            createFiles("file " + i + ".txt");
        }
    }

    public static void createFiles(String files) {
        try {
            File f = new File(files);

            if (f.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exist");
            }
        } catch (Exception ex) {
            System.out.println("Something went wrong");
        }

    }

}
