import java.util.Scanner;

import javax.swing.InputMap;

public class Deposit extends Thread {
    public void run() {
        Account ac = new Account();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter deposit amount");
        ac.balance = sc.nextDouble();

    }

}
