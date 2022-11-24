import java.util.Scanner;

//wow -le
//012

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = sc.nextLine();

        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);

        }

        System.out.println("Reversed word is " + reverse);
        System.out.println();

        if (word.equals(reverse)) {
            System.out.println("The word is palindrome");
        } else {
            System.out.println("The word is not palindrome");
        }
    }
}
