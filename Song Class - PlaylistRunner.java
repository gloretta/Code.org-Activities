public class PlaylistRunner {
  public static void main(String[] args) {
    
    Song thunderstruck = new Song();


    ConstructorsHelper.printConstructors(thunderstruck);
    System.out.println(thunderstruck.getTitle());
    System.out.println(thunderstruck.getRating());
    
  }
}
