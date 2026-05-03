public class TVShow extends Content {

  private int numEpisodes;  // The number of episodes

  public void TVShow(String title, int year) {
    super(title, year);
  }

  public void printTVShowInfo() {
    printContentInfo();
    System.out.println("Number of Episodes: " + numEpisodes);
  }
}

//*Not all files in this program are commited to Github.
