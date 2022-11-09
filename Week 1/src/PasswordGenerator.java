import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = upper.toLowerCase();
        String sChar = "~`!@#$%^&*()-_=+{}[];:'|<,>.?/";
        String digits = "0123456789";
        String combo = upper + lower + sChar + digits;

        System.out.println("Enter password length ");
        int len = sc.nextInt();

        char[] password = new char[len];

        for (int i = 0; i < len; i++) {
            password[i] = combo.charAt(ran.nextInt(combo.length()));
        }

        System.out.println("Generated Password is " + new String(password));

    }
}
