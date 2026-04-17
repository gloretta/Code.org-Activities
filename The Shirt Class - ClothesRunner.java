public class ClothesRunner {
  public static void main(String[] args) {

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Instantiate a Shirt object. Print the constructor to the console using
     * ConstructorsHelper.printConstructors(nameOfObject), and print the values
     * assigned to the instance variables using the methods in the Shirt class.
     * -----------------------------------------------------------------------------
     */
    Shirt eddieBauer = new Shirt();

    ConstructorsHelper.printConstructors(eddieBauer);
    System.out.println(eddieBauer.getSize());
    System.out.println(eddieBauer.getPrice());
   
  }
}
