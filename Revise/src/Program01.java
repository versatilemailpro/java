import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text");
        String text = sc.nextLine();

        String word = "";

        String[] arr = text.trim().split(" ");

        for (String newText : arr) {
            if (newText.equals("")) {

            } else {
                word += newText + " ";

            }

        }
        System.out.println(word.trim());
    }

}
