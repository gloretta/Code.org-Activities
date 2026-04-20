public class Character {

  private String name;
  private boolean isLeadRole;


  public Character() {
    name = "unknown";
    isLeadRole = false;
  }

  public Character(String aName, boolean aIsLeadRole) {
    name = aName;
    isLeadRole = aIsLeadRole;
  }


  public String getName() {
    return name;
  }

  public boolean hasLeadRole() {
    return isLeadRole;
  }
}
