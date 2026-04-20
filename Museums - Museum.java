public class Museum {

  private String name;
  private boolean isNonProfit;

  public Museum() {
    name = "unknown";
    isNonProfit = false;
  }

  public Museum(String aName, boolean aIsNonProfit) {
    name = aName;
    isNonProfit = aIsNonProfit;
  }

  public String getName() {
    return name;
  }

  public boolean getIsNonProfit() {
    return isNonProfit;
  }
}
