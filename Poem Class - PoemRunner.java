public class PoemRunner {
  public static void main(String[] args) {

    Poem shakespeare = new Poem();
    ConstructorsHelper.printConstructors(shakespeare);
    System.out.println(shakespeare.getTitle());
    System.out.println(shakespeare.getNumLines());
      
  }
}
