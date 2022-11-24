public class Program {
    public static void main(String[] args) {

        SetComputer s1 = new SetComputer("Acer Nitro 5", 8, 434534);
        s1.setComputer("Windows 10", 135);

        System.out.println(s1.getName());
        System.out.println(s1.getRam());
        System.out.println(s1.getOs());
        System.out.println(s1.getCost());
        System.out.println(s1.getPowerConsume());

    }
}
