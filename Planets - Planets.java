public class Planet {

  private String name;
  private int numMoons;
  private boolean hasRingSystem;
  
  public Planet() {
    name = "unknown";
    numMoons = 1;
    hasRingSystem = false;
  }

  public Planet(String aName, int aNumMoons, boolean aHasRingSystem) {
    name = aName;
    numMoons = aNumMoons;
    hasRingSystem = aHasRingSystem;
  }

  public Planet(String aName, int aNumMoons) {
    name = aName;
    numMoons = aNumMoons;
    hasRingSystem = false;
  }

  public String getName() {
    return name;
  }

  public int getNumMoons() {
    return numMoons;
  }

  public boolean getHasRingSystem() {
    return hasRingSystem;
  }
}
