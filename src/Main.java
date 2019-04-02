public class Main {

    public static void main(String[] args) {
      Greet greet = new Greet("Valentin", "Viki");
      greet.greetings();

      Cheer cheer = new Cheer();
      cheer.cheering("Chrysoprase");

      Count.count(12);
    }
}
