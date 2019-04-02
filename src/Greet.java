public class Greet {
  private String name;

  public Greet(String name){
    this.name = name;
  }

  public void greetings(){
    System.out.println("Hello " + name);
    System.out.println("Greetings for " + name);
  }
}
