public class Computer {
    private String name;
    private int ram;
    private double cost;
    private String os;
    private float powerConsume;

    public Computer(String name, int ram, double cost) {
        this.name = name;
        this.ram = ram;
        this.cost = cost;
        this.os = "";
        this.powerConsume = 0;
    }

    public String getName() {
        return name;
    }

    public int getRam() {
        return ram;
    }

    public double getCost() {
        return cost;
    }

    public String getOs() {
        return os;
    }

    public float getPowerConsume() {
        return powerConsume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setPowerConsume(float powerConsume) {
        this.powerConsume = powerConsume;
    }

}
