public class Player {

  private int highScore;   // A player's high score

  /*
   * Sets highScore to the specified high score
   */
  public Player(int highScore) {
    this.highScore = highScore;
  }

  /*
   * Returns the value assigned to highScore
   */
  public int getHighScore() {
    return highScore;
  }

  /*
   * Sets highScore to newHighScore
   */
  public void setHighScore(int newHighScore) {
    highScore = newHighScore;
  }

  @Override
  public String toString() {
    return "High Score: " + this.highScore;
  }
}
