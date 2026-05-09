public class Pie extends Dessert {

  private int diameter;      // The diameter of a pie

  public Pie() {
    super();
    diameter = 20;
  }
  
  public Pie(String aflavor, double aprice, int adiameter) {
    super(aflavor, aprice);
    diameter = adiameter;
  }
}
