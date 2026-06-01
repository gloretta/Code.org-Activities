public class Cupcake extends Dessert {

  private boolean isMini;   // Whether or not a cupcake is a miniature cupcake

  /*
   * Sets isMini to true
   */
  public Cupcake() {
    isMini = true;
  }

  /*
   * Sets the flavor to the specified flavor, the price to the
   * specified price, and isMini to the specified status
   */
  public Cupcake(String flavor, double price, boolean isMini) {
    super(flavor, price);
    this.isMini = isMini;
  }

  /*
   * Returns the value assigned to isMini
   */
  public boolean getIsMini() {
    return isMini;
  }

  /*
   * Sets isMini to newIsMini
   */
  public void setIsMini(boolean newIsMini) {
    isMini = newIsMini;
  }

  public String toString() {
    return "Flavor: " + getFlavor() + "\nPrice: " + getPrice() + "\nIs Mini? " + isMini;
  }
  
}
