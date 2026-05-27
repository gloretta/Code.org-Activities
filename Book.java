public class Book {

  private String title;    // The title of a book

  /*
   * Sets title to the specified title
   */
  public Book(String title) {
    this.title = title;
  }

  /*
   * Returns the value assigned to title
   */
  public String getTitle() {
    return title;
  }

  /*
   * Sets title to newTitle
   */
  public void setTitle(String newTitle) {
    title = newTitle;
  }

  @Override
  public String toString() {
    return "Title: " + this.title;
  }
}
