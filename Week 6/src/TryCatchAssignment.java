import java.util.Scanner;

public class TryCatchAssignment {
    public static void main(String[] args) {

        // Make object of class Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        try {

            int num = sc.nextInt();
            System.out.println("Number is " + num);

        } catch (Exception ex) {
            System.out.println("Input integers only");
        } finally {
            System.out.println("Syabash beta, music!");
        }
    }
}
