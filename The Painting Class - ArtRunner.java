public class ArtRunner {
  public static void main(String[] args) {

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Instantiate a Painting object. Print the constructor to the console using
     * ConstructorsHelper.printConstructors(nameOfObject), and print the values
     * assigned to the instance variables using the methods in the Painting class.
     * -----------------------------------------------------------------------------
     */
    Painting monaLisa = new Painting();

    ConstructorsHelper.printConstructors(monaLisa);
    System.out.println(monaLisa.getTitle());
    System.out.println(monaLisa.getYear());

    
    
  }
}
