import java.util.Scanner;

public class MyConsole {
  public static void main(String[] args) {

    Calculator myCalc = new Calculator();
    
    // TO DO #1: Create a Scanner object called input.
    
    Scanner input = new Scanner(System.in);
    myCalc.printSum(input);
  }
}
