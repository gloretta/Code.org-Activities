public class FoodTruckRunner {
  public static void main(String[] args) {

    Dessert cheeseCake = new Dessert("chocolate", 10.99);
    System.out.println(cheeseCake);

    Cookie choco = new Cookie("chocolate", 2.99, true);
    System.out.println(choco);

    Pie applePie = new Pie("pie", 6.99, 20);
    System.out.println(applePie);
    
  }
}
