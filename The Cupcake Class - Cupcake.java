public class Cupcake extends Dessert {

  private boolean isMini;   // Whether or not a cupcake is a miniature cupcake

  public Cupcake() {
    super();
    isMini = false;
  }

  public Cupcake(String flavor, double price, boolean aIsMini) {
    super(flavor, price);
    isMini = aIsMini;
  }
}
