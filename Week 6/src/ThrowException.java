public class ThrowException {
    public static void main(String[] args) {

        try {
            throwException();

        } catch (Exception ex) {
            System.out.println("Something went wrong");
        }

    }

    public static void throwException() throws Exception {

        System.out.println("Good morining");
        // throw (new Exception());
    }
}
