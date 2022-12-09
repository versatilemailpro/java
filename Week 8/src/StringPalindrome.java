public class StringPalindrome {
    public static void main(String[] args) {
        String name = "Prabesh";
        StringBuffer text = new StringBuffer(name);

        if (name.equals(text.reverse().toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
