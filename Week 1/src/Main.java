import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose +,-,*,/");
        char operator = sc.next().charAt(0);

        System.out.println("Enter first number ");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number ");
        sc.nextLine();
        double num2 = sc.nextDouble();

        Output out = new Output();
        switch (operator) {
            case '+':
                out.outputOfSum(num2, num2);
                break;

            case '-':
                out.outputOfSub(num1, num2);
                break;

            case '*':
                out.outputOfMul(num1, num2);
                break;

            case '/':
                out.outputOfMul(num1, num2);
                break;

            default:
                System.out.println("Something went wrong");

        }

    }
}