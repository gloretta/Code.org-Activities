public class ExpressionsRunner {
  public static void main(String[] args) {

    int result = 0;
    int number = 2;

    System.out.println("Result: " + result);

    result += number;
    System.out.println("Result + number: " + result);
    
    result *= number;
    System.out.println("Result * number: " + result);

    result -= number;
    System.out.println("Result - number: " + result);

    result /= number;
    System.out.println("Result / number: " + result);

    result++;
    System.out.println("Result++: " + result);

    result--;
    System.out.println("Result--: " + result);
  }
}
