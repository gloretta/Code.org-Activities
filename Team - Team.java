public class Team {

  private String name;
  private int numWins;

  public Team() {
    name = "unknown";
    numWins = 0;
  }

  /* ----------------------------------- TO DO -----------------------------------
   * ✅ Write a parameterized constructor to assign specific values to
   * the name and numWins instance variables.
   * -----------------------------------------------------------------------------
   */
  public Team(String aName, int aNumWins) {
    name = aName;
    numWins = aNumWins;
  }

  
  /* ----------------------------------- TO DO -----------------------------------
   * ✅ Write a parameterized constructor to assign a specific value to the
   * name instance variable and a default value to the numWins instance variable.
   * -----------------------------------------------------------------------------
   */
  public Team(String aName) {
    name = aName;
    numWins = 5;
  }


  public String getName() {
    return name;
  }

  public int getNumWins() {
    return numWins;
  }
}
