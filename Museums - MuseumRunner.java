public class MuseumRunner {
  public static void main(String[] args) {

    Museum britishMuseum = new Museum("The British Museum", true);
    
    System.out.println(britishMuseum.getName());
    System.out.println(britishMuseum.getIsNonProfit());
  }
}
