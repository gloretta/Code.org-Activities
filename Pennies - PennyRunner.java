public class PennyRunner {
    public static void main(String args[]) {
                 
      double totalAsDouble = 4.6;
      System.out.println("$" + totalAsDouble);
      
      PennyCounter myPennyCounter = new PennyCounter();

      int totalAsInt = myPennyCounter.getTotalPennies(totalAsDouble);
      System.out.println(totalAsInt + " pennies");
      
    }
}
