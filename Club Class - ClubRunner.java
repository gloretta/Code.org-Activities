public class ClubRunner {
  public static void main(String[] args) {

    Club gwc = new Club();
    ConstructorsHelper.printConstructors(gwc);
    System.out.println(gwc.getSponsor());
    System.out.println(gwc.getNumMembers());
    
    
  }
}
