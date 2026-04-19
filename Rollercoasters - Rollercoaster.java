public class Rollercoaster {

  private String name;
  private int speed;

  public Rollercoaster() {
    name = "unknown";
    speed = 20;
  }
  
  public Rollercoaster(String aName, int aSpeed) {
    name = aName;
    speed = aSpeed;
  }

  public String getName() {
    return name;
  }

  public int getSpeed() {
    return speed;
  }
  
}
