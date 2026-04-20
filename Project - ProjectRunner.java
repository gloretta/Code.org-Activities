public class ProjectRunner {
  public static void main(String[] args) {

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Instantiate a Project object using each parameterized constructor,
     * then print the constructors and values assigned to the instance variables.
     * -----------------------------------------------------------------------------
     */
    Project forNelson = new Project("About Yourself", 6);

    System.out.println(forNelson.getTitle());
    System.out.println(forNelson.getNumPhotos());
  }
}
