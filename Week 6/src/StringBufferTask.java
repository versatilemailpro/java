public class StringBufferTask {

    public static void main(String[] args) {
        String name = "Prabesh Gupta";
        System.out.println(name.hashCode());

        name = name.concat("Pong ki pong");

        System.out.println(name);
        System.out.println(name.hashCode());
    }
}
