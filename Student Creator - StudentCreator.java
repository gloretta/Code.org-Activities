import java.util.Scanner;

public class StudentCreator {

  public void createStudent(Scanner input) {
    //Get the student's name with the Scanner input.
    System.out.println("Enter name: ");
    String name = input.nextLine();

    //Get the student's GPA.
    System.out.println("Enter GPA: ");
    double gpa = input.nextDouble();

    //Create a Student object with the user's values.
    Student gloria = new Student(name, gpa);

    //Print a confirmation that the Student was created.
    System.out.println("Student " + name + " created with GPA " + gpa);

    //Close the Scanner.
    input.close();
    
  }
}
