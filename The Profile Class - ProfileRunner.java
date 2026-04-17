public class ProfileRunner {
  public static void main(String[] args) {

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Instantiate a Profile object. Print the constructor to the console using
     * ConstructorsHelper.printConstructors(nameOfObject), and print the values
     * assigned to the instance variables using the methods in the Profile class.
     * -----------------------------------------------------------------------------
     */
    Profile julia = new Profile();


    ConstructorsHelper.printConstructors(julia);
    System.out.println(julia.getName());
    System.out.println(julia.getYearJoined());

    
    
  }
}
