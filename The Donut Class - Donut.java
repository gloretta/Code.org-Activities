public class Donut extends Dessert {
  
  private boolean hasSprinkles;   // Whether or not a donut has sprinkles

  public Donut() {
    super();
    hasSprinkles = false;
  }

  public Donut(String flavor, double price, boolean aHasSprinkles) {
    super(flavor, price);
    hasSprinkles = aHasSprinkles;
  }  
}
