public class Project {

  private String title;
  private int numPhotos;

  public Project() {
    title = "unknown";
    numPhotos = 0;
  }

  /* ----------------------------------- TO DO -----------------------------------
   * ✅ Write a parameterized constructor to assign specific values to
   * the title and numPhotos instance variables.
   * -----------------------------------------------------------------------------
   */
  public Project(String aTitle, int aNumPhotos) {
    title = aTitle;
    numPhotos = aNumPhotos;
  }

  /* ----------------------------------- TO DO -----------------------------------
   * ✅ Write a parameterized constructor to assign a specific value to the title
   * instance variable and a default value to the numPhotos instance variable.
   * -----------------------------------------------------------------------------
   */
  public Project(String aTitle) {
    title = aTitle;
    numPhotos = 0;
  }
  
  public String getTitle() {
    return title;
  }

  public int getNumPhotos() {
    return numPhotos;
  }
}
