import java.util.Scanner;

public class Greeter {

  public void printGreeting(Scanner input) {

    System.out.println("What's your name? ");
    String name = input.nextLine();

    System.out.println("Hello " + name + "!");
    
  }
}
