/**
* This class divides two numbers.
*
* Activity 11
* @author Davis Leeth - COMP 1213
* @version 4/12/21
*/
public class Division {
   /** Divides two ints.
   *   @param num num
   *   @param denom de
   *   @return result
   */
   public static int intDivide(int num, int denom) {
      try {
         return num / denom;
      }
      catch (ArithmeticException e) {
         return 0;
      }
   }
   /** Divides two ints.
   *   @param num num
   *   @param denom de
   *   @return result
   *   @throws IllegalArgumentException arg
   */
   public static double decimalDivide(int num, int denom) {
      if (denom == 0) {
         throw new IllegalArgumentException("The denominator cannot"
            + " be zero");
      }
      return (float) num / denom;
   }
}