public class DisplayPrinter {

    private int maxWidth;  // Maximum character width for printing across the display

    /*
     * Constructs a DisplayPrinter object with the specified maximum width
     */
    public DisplayPrinter(int maxWidth) {
        this.maxWidth = maxWidth;
    }

    /*
     * Returns the maximum width for printing
     */
    public int getMaxWidth() {
        return maxWidth;
    }

    /*
     * Prints a message across the display, checking for overflow
     *
     * Returns true if the message can be printed without overflow, false otherwise
     */
    public boolean printMessage(String message) {
      if (message.length() <= maxWidth) {
        System.out.println(message);
        return true;
      } else {
        System.out.println(message);
        return false;
      }
      
    }
}
