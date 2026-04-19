public class NationalPark {

  private String name;
  private int area;

  public NationalPark() {
    name = "unknown";
    area = 100;
  }

  public NationalPark(String aName, int aArea) {
    name = aName;
    area = aArea;
  }

  public String getName() {
    return name;
  }

  public int getArea() {
    return area;
  }
}
