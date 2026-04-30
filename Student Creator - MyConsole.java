import java.util.Scanner;

public class MyConsole {
  public static void main(String[] args) {

    StudentCreator myCreator = new StudentCreator();

    //Create a Scanner object called input.
    Scanner input = new Scanner(System.in);
    
    myCreator.createStudent(input);
    
  }
}
