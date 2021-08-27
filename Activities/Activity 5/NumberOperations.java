/**
* This program will hold an integer value and
   * provide methods to perform various operations on that value.
*
* Activity 5
* @author Davis Leeth - COMP 1213
* @version 2/16/21
*/

public class NumberOperations {
   private int number;
   /** Constructor.
   *   @param numberIn number
   */
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
    /** Gets value.
   *   @return number
   */
   public int getValue() {
      return number;
   }
   /** Checks odds under.
   *   @return output
   */
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
   /** Checks powers.
   *   @return output
   */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }
   /** Compares numbers.
   *   @return compared
   *   @param compareNumber number
   */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }
   /** To string.
   *   @return toString
   */
   public String toString() {
      return number + "";
   }
   
}