public class FoodTruckRunner {
  public static void main(String[] args) {

    Dessert cheeseCake = new Dessert("chocolate", 10.99);
    System.out.println(cheeseCake);

    Cookie choco = new Cookie("chocolate", 2.99, true);
    System.out.println(choco);

    Pie applePie = new Pie("apple", 6.99, 20);
    System.out.println(applePie);

    Donut white = new Donut("white chocolate", 1.99, true);
    System.out.println(white);

    Cupcake revVelvet = new Cupcake("red velvet", 2.99, false);
    
  }
}
