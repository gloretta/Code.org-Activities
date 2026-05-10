public class FoodTruckRunner {
  public static void main(String[] args) {

    Cupcake chocolate = new Cupcake("chocolate", 2.99, true);
    Cupcake vanilla = new Cupcake();
    ConstructorsHelper.printConstructors(chocolate);
    ConstructorsHelper.printConstructors(vanilla);
  }
}
