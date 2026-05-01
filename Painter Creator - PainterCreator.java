import org.code.neighborhood.Painter;
import java.util.Scanner;

public class PainterCreator {

  public void createPainter(Scanner input) {

    System.out.println("Enter x value: ");
    int x = input.nextInt();

    System.out.println("Enter y value: ");
    int y = input.nextInt();

    System.out.println("Enter starting direction: ");
    String startDirection = input.next();

    System.out.println("Enter  starting amount of paint: ");
    int amountPaint = input.nextInt();

    Painter julia = new Painter(x, y, startDirection, amountPaint);

    input.close();
    
  }
  
}
