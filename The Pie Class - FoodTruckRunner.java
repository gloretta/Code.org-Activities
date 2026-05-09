public class FoodTruckRunner {
  public static void main(String[] args) {

    Pie apple = new Pie("apple", 6.99, 16);
    Pie plain = new Pie();
    ConstructorsHelper.printConstructors(apple);
    ConstructorsHelper.printConstructors(plain);

  }
}
