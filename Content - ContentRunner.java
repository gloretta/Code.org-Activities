public class ContentRunner {
  public static void main(String[] args) {

    System.out.println("Default Content Object");
    Content shortVideo = new Content();
    shortVideo.printContentInfo();

    System.out.println();

    System.out.println("youTubeVideo Object");
    Content youTubeVideo = new Content("Change the Face of Computer Science", 2021);
    youTubeVideo.printContentInfo();

    System.out.println();

    System.out.println("Default Movie Object");
    Movie comingSoon = new Movie();
    comingSoon.printMovieInfo();

    System.out.println();

    System.out.println("findingNemo Object");
    Movie findingNemo = new Movie("Finding Nemo", 2003, 100);
    findingNemo.printMovieInfo();

    System.out.println();

    System.out.println("friends Object");
    TVShow friends = new TVShow("Friends", 1944, 236);
    friends.printTVShowInfo();

  }
}


//*Not all files in this program are commited to Github.
