public class PlanetsRunner {
  public static void main(String[] args) {

    Planet earth = new Planet("Earth", 1, false);
    System.out.println(earth.getName());
    System.out.println(earth.getNumMoons());
    System.out.println(earth.getHasRingSystem());

  }
}
