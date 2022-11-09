public class Pattern1 {

    public static void main(String[] args) {

        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int i = 2; i <= 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int l = 1; l <= 4; l++) {
            System.out.println("*");
        }

    }
}