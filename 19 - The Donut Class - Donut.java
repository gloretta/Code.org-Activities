public class Donut extends Dessert {
  
  private boolean hasSprinkles;   // Whether or not a donut has sprinkles

  /*
   * Sets hasSprinkles to true
   */
  public Donut() {
    hasSprinkles = true;
  }

  /*
   * Sets the flavor to the specified flavor, price to the
   * specified price, and hasSprinkles to the specified status
   */
  public Donut(String flavor, double price, boolean hasSprinkles) {
    super(flavor, price);
    this.hasSprinkles = hasSprinkles;
  }

  /*
   * Returns the value assigned to hasSprinkles
   */
  public boolean getHasSprinkles() {
    return hasSprinkles;
  }

  /*
   * Sets hasSprinkles to newHasSprinkles
   */
  public void setHasSprinkles(boolean newHasSprinkles) {
    hasSprinkles = newHasSprinkles;
  }

  public String toString() {
    return "Flavor: " + getFlavor() + "\nPrice: " + getPrice() + "\nHas Sprinkles? " + this.hasSprinkles;
  }
  
}
