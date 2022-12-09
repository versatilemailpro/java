import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input name");
        String name = sc.nextLine();
        System.out.println();
        System.out.println("Input account number");
        String accountNo = sc.nextLine();
        System.out.println();

        // Thread for Deposit

        Deposit deposit = new Deposit();
        deposit.start();
        try {
            deposit.join();
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        // Thread for Withdraw

        Withdraw withdraw = new Withdraw();
        withdraw.start();
    }
}
