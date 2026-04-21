public class Electronic {

  private String name;
  private double price;
  private boolean isRefurbished;
  

  public Electronic() {
    name = "unknown";
    price = 50.99;
    isRefurbished = false;
  }

  public Electronic(String aName, double aPrice, boolean aIsRefurbished) {
    name = aName;
    price = aPrice;
    isRefurbished = aIsRefurbished;
  }


  public Electronic(String aName, double aPrice) {
    name = aName;
    price = aPrice;
    isRefurbished = false;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public boolean getIsRefurbished() {
    return isRefurbished;
  }
}
