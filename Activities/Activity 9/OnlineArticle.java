/**
* This program is the OnlineArticle.
*
* Activity 9
* @author Davis Leeth - COMP 1213
* @version 3/30/21
*/
public class OnlineArticle extends OnlineTextItem {
   private int wordCount;
   /** This constructor method initializes the given info to its
   *   appropriate variable.
   *   @param nameIn name
   *   @param priceIn price
   */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   /** Sets word count.
   *   @param wordCountIn count
   */
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }
}