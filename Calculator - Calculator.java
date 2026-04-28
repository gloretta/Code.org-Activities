import java.util.Scanner;

/*
 * Gets input from a user and prints the sum
 */

public class Calculator {
  public int firstNum;
  public void printSum(Scanner input) {
    // TO DO #2: Get the first number from the user with the Scanner input.
    System.out.println("Enter the first number: ");
    int firstNum = input.nextInt();

    // TO DO #3: Get the second number from the user.
    System.out.println("Enter the second number: ");
    int secondNum = input.nextInt();
    // TO DO #4: Print the sum of the two numbers.
    System.out.println(firstNum + secondNum);

    // TO DO #5: Close the Scanner.
    input.close();
  }
  
}
