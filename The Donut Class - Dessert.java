public class Dessert {

  private String flavor;    // The flavor of a dessert
  private double price;     // The price of a dessert

  public Dessert() {
    this("plain", 0.50);
  }

  /*
   * Sets flavor to the specified flavor and
   * price to the specified price
   */
  public Dessert(String flavor, double price) {
    this.flavor = flavor;
    this.price = price;
  }
  
}
