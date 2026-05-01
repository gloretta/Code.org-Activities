import org.code.neighborhood.Painter;
import java.util.Scanner;

public class MyNeighborhood {
  public static void main(String[] args) {

    PainterCreator myCreator = new PainterCreator();

    Scanner input = new Scanner(System.in);
    
    myCreator.createPainter(input);
    
  }
}
