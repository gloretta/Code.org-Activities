/*
 * Represents a cookie that can be sold at a food truck
 * Cookie is a type of Dessert
 */
public class Cookie extends Dessert {

  private boolean isChewy;   // Whether or not a cookie is chewy

  /*
   * ✅ TO DO #1: Write a no-argument constructor in the Cookie class.
   */
  public Cookie() {
    super();
    isChewy = false;
  }

  /*
   * ✅ TO DO #2: Write a parameterized constructor in the Cookie class.
   */
  public Cookie(String aflavor, double aprice, boolean aisChewy) {
    super(aflavor, aprice);
    isChewy = aisChewy;
  }

}
