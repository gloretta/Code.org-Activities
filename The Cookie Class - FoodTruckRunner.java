public class FoodTruckRunner {
  public static void main(String[] args) {

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Instantiate objects using the no-argument and parameterized
     * constructors. Then use ConstructorsHelper.printConstructors(nameOfObject)
     * to print the constructors for the objects to the console.
     * -----------------------------------------------------------------------------
     */
    Cookie whiteChocoChip = new Cookie();
    Cookie chocoChip = new Cookie("chocolate chip", 2.99, true);
    ConstructorsHelper.printConstructors(chocoChip);
    ConstructorsHelper.printConstructors(whiteChocoChip);

  }
}
