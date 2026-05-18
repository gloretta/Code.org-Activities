/*
 * Represents a game high score tracker with overflow error checking
 */
public class HighScoreTracker {
  
    private int highScoreInt;            // Current high score in the game as an int
    private double highScoreDouble;      // Current high score in the game as a double
  
    /*
     * Constructs a HighScoreTracker object with the specified initial high score
     */
    public HighScoreTracker(int initialScore) {
        this.highScoreInt = initialScore;
        this.highScoreDouble = initialScore; // Start with int, widen to double if needed
    }
  
    /*
     * Returns the current high score in the game as an int
     */
    public int getHighScoreInt() {
        return highScoreInt;
    }

    /*
     * Returns the current high score in the game as a double
     */
    public double getHighScoreDouble() {
        return highScoreDouble;
    }

    public boolean increaseHighScore(int amount){
      if ((long) highScoreInt + amount <= Integer.MAX_VALUE) {
          highScoreInt += amount;
          return false;
      } else {
          highScoreDouble += amount;
          return true;
      }
    }
}

