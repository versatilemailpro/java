import java.util.Scanner;

public class Program05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a text");
        String text = sc.nextLine();

        System.out.println(text.replace("i", "pi"));

    }
}
