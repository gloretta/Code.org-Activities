public class StoreRunner {
  public static void main(String[] args) {

    Electronic mac = new Electronic("MacBook Air", 999.99, true);
    System.out.println(mac.getName());
    System.out.println(mac.getPrice());
    System.out.println(mac.getIsRefurbished());
    
  }
}
