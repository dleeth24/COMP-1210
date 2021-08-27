/**
* This class creates a Scores list and has various methods that
* gather information from it and access it.
*
* Activity 9
* @author Davis Leeth - COMP 1213
* @version 3/23/21
*/
public class Scores {
   private int[] numbers;
   /** This constructor method initializes the given info to its
   *   appropriate variable.
   *   @param numbersIn number
   */
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   }
   /** Finds evens.
   *   @return evens
   */
   public int[] findEvens() {
      int count = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            count++;
         }
      }
      
      int[] evens = new int[count];
      int j = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[j] = numbers[i];
            j++;
         }
      }
      return evens;
   }
   /** Finds odds.
   *   @return odds
   */
   public int[] findOdds() {
      int count = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            count++;
         }
      }
      
      int[] odds = new int[count];
      int j = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            odds[j] = numbers[i];
            j++;
         }
      }
      return odds;
   }
   /** Calculates average.
   *   @return avg
   */
   public double calculateAverage() {
      int total = 0;
      for (int i = 0; i < numbers.length; i++) {
         total += numbers[i];
      }
      double avg = total / numbers.length;
      return avg;
   }
   /** toString method.
   *   @return toString
   */
   public String toString() {
      String result = "";
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
      return result;
   }
   /** Reverse toString method.
   *   @return reverse
   */
   public String toStringInReverse() {
      String result = "";
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers[i] + "\t";
      }
      return result;
   }
}