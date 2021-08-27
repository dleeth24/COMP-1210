/**
* This program is the OnlineBook class.
*
* Activity 9
* @author Davis Leeth - COMP 1213
* @version 3/30/21
*/
public class OnlineBook extends OnlineTextItem {
   protected String author;
   /** This constructor method initializes the given info to its
   *   appropriate variable.
   *   @param nameIn name
   *   @param priceIn price
   */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   /** toString method.
   *   @return toString
   */
   public String toString() {
      return super.name + " - " + author + ": $" + super.price;
   }
   /** Sets author.
   *   @param authorIn author
   */
   public void setAuthor(String authorIn) {
      author = authorIn;
   }
}