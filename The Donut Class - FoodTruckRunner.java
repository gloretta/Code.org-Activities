public class FoodTruckRunner {
  public static void main(String[] args) {

    Donut jelly = new Donut("jelly filled", 3.99, true);
    Donut chocolate = new Donut();
    ConstructorsHelper.printConstructors(chocolate);
    ConstructorsHelper.printConstructors(jelly);
  }
}
