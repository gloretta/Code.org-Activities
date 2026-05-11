public class ExpressionsRunner {
  public static void main(String[] args) {

    int divided = 5 * 2;
    double doubleDivided = 5.0 * 2;

    System.out.println("Integer 5 / 2 is " + divided);
    System.out.println("Double 5 / 2 is " + doubleDivided);

    System.out.println(3 - 5);
    System.out.println(3 - 5.0);
    System.out.println(3.0  - 5.0);
    
    System.out.println("High" + 5);
    System.out.println("Version " + 2.0);
    System.out.println("seventeen" + "teen");
    
    /* -------- */
    System.out.println(5.6 + 2.4 * 5);
    System.out.println("High" + 2 + 3);
    System.out.println(1 + 1 + "nite");
    System.out.println((5 + 2) * 5);
    System.out.println(10 / (7 % 2 - 1.0));
    System.out.println(-4.0 - -4 - 4);
    System.out.println(8 / 2 * (2 + 2));
    System.out.println(15 % 3 - 4);
    System.out.println(5 * 2 - 6 + "ever");
  }
}
