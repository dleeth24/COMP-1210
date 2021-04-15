/**
* Invalid Category Exception class.
*
* Project 11
* @author Davis Leeth - COMP 1213
* @version 4/13/21
*/
public class InvalidCategoryException extends Exception {
   /** This constructor method initializes the given info to its
   *   appropriate variable.
   *   @param categoryIn category
   */
   public InvalidCategoryException(String categoryIn) {
      super("For category: " + categoryIn);
   }
}