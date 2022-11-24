public class SetComputer extends Computer {

    public SetComputer(String name, int ram, double cost) {
        super(name, ram, cost);
    }

    public void setComputer(String os, float powerConsume) {

        super.setOs(os);
        super.setPowerConsume(powerConsume);
    }
}
