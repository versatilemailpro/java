public class OutputMammal {
    private Mammal mammal;

    public OutputMammal(Mammal mammal) {
        this.mammal = mammal;
    }

    public void display() {
        mammal.run();
        mammal.eat();
    }
}
