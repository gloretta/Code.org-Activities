public class Playlist {

  private int numSongs;    // The number of songs in a playlist

  /*
   * Sets numSongs to the specified number of songs
   */
  public Playlist(int numSongs) {
    this.numSongs = numSongs;
  }

  /*
   * Returns the value assigned to numSongs
   */
  public int getNumSongs() {
    return numSongs;
  }

  /*
   * Sets numSongs to newNumSongs
   */
  public void setNumSongs(int newNumSongs) {
    numSongs = newNumSongs;
  }

  @Override
  public String toString() {
    return "Number of Songs: " + this.numSongs;
  }
}
