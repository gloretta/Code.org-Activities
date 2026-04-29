import java.util.Scanner;

public class MyConsole {
  public static void main(String[] args) {

    Greeter myGreeter = new Greeter();

    Scanner input = new Scanner(System.in); //System.in is very important!!
    myGreeter.printGreeting(input);
    input.close();
    
  }
}
