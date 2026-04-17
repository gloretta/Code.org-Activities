public class TeamRunner {
  public static void main(String[] args) {

    Team osadchuki = new Team();
    ConstructorsHelper.printConstructors(osadchuki);
    System.out.println(osadchuki.getTeamName());
    System.out.println(osadchuki.getNumAthletes());

  }
}
