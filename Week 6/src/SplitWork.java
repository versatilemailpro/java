public class SplitWork {
    public static void main(String[] args) {

        String name = " Prabesh  Gupta ";

        // Initiating array
        String[] arr = name.trim().split(" ");

        // System.out.println(arr[2]);

        String clean = "";

        for (String newName : arr) {
            if (!newName.isEmpty()) {
                clean += newName + " ";
            }
        }

        System.out.println("Clean name is " + clean.trim());
    }
}
