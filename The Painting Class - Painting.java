/*
 * Represents a painting
 */
public class Painting {

  private String title;    // The title of a painting
  private int year;        // The year a painting was created

  /* ----------------------------------- TO DO -----------------------------------
   * ✅ Write a no-argument constructor to assign default values to the
   * title and year instance variables.
   * -----------------------------------------------------------------------------
   */
    public Painting() {
      title = "new painting";
      year = 2023;
    }

  /*
   * Returns the current value assigned to title
   */
  public String getTitle() {
    return title;
  }

  /*
   * Returns the current value assigned to year
   */
  public int getYear() {
    return year;
  }
  
}
