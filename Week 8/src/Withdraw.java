import java.util.Scanner;

public class Withdraw extends Thread {

    public void run() {
        Account ac = new Account();
        ac.balance = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter withdraw ammount");
        Double withdrawAmt = sc.nextDouble();

        for (int i = 0; i < 5; i++) {

            if (withdrawAmt <= ac.balance) {
                System.out.println("Withdraw Successful Rs. " + withdrawAmt);
                ac.balance = ac.balance - withdrawAmt;
                System.out.println("Rmaining account balance Rs. " + ac.balance);
            } else {
                System.out.println("Withdraw failed Rs. " + withdrawAmt);
                System.out.println("Rmaining account balance Rs. " + ac.balance);

            }

        }
    }

}
