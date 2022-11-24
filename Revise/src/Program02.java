import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter address");
        String address = sc.nextLine();
        System.out.println("Enter nation");
        String nation = sc.nextLine();

        display(name, address, nation);

    }

    public static void display(String name, String address, String nation) {

        System.out.println();
        System.out.println("Name is " + name.toUpperCase());
        System.out.println("Address is " + address.toUpperCase());
        System.out.println("Nation is " + nation.toUpperCase());
    }
}
