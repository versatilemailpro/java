public class Main {
    public static void main(String[] args) {

        Tiger tiger = new Tiger();

        OutputMammal tt = new OutputMammal(tiger);
        OutputMammalSwim ttt = new OutputMammalSwim(tiger);
        tt.display();
        ttt.display();

        System.out.println();
        Horse horse = new Horse();

        OutputMammal hh = new OutputMammal(horse);
        hh.display();
    }
}
