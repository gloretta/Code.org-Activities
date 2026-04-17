/*
 * Represents a custom shirt
 */
public class Shirt {

  private String size;     // The size of a shirt
  private double price;    // The price of a shirt

  /* ----------------------------------- TO DO -----------------------------------
   * ✅ Write a no-argument constructor to assign default values to the
   * size and price instance variables.
   * -----------------------------------------------------------------------------
   */
    public Shirt() {
      size = "small";
      price = 5.99;
    }

  /*
   * Returns the current value assigned to size
   */
  public String getSize() {
    return size;
  }

  /*
   * Returns the current value assigned to price
   */
  public double getPrice() {
    return price;
  }
  
}
