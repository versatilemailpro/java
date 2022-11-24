import java.util.Scanner;

public class TryCatchNewAssignment {
    public static void main(String[] args) {

        try {

            getInput();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static int getInput() throws Exception {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int num = sc.nextInt();

            return num;
        } catch (Exception ex) {
            throw new Exception("Isn't valid number");
        }

    }

}
