/*
 * Represents a user's profile on a social media app
 */
public class Profile {

  private String name;      // The name of a user
  private int yearJoined;   // The year a user joined the app

  /* ----------------------------------- TO DO -----------------------------------
   * ✅ Write a no-argument constructor to assign default values to the
   * name and yearJoined instance variables.
   * -----------------------------------------------------------------------------
   */

  public Profile() {
    name = "new user";
    yearJoined = 2023;
  }

  /*
   * Returns the current value assigned to name
   */
  public String getName() {
    return name;
  }

  /*
   * Returns the current value assigned to yearJoined
   */
  public int getYearJoined() {
    return yearJoined;
  }
  
}
