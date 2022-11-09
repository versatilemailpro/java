import java.time.LocalDate;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate today = LocalDate.now();

        System.out.println("Enter your birthyear ");

        int birthYear = sc.nextInt();
        int year = today.getYear();

        int age = year - birthYear;
        System.out.println("Age is " + age);
    }

}
