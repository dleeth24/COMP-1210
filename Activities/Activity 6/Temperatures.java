import java.util.ArrayList;
/**
* This class stores the ArrayList which holds
* the temperatures. It also has the methods that return the
* lowest and highest temp as well as methods that compare an
* entered temp to the current low or high. It also has a toString method.
*
*
* Activity 6
* @author Davis Leeth - COMP 1213
* @version 2/22/21
*/
public class Temperatures {
   private ArrayList<Integer> temperatures = new ArrayList<Integer>();
   
   /** This constructor method initializes the given info to its
   *   appropriate variable.
   *   @param temperaturesIn temp
   */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
   /** Gets the low temp.
   *   @return low
   */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 1; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }   
   /** Gets the high temp.
   *   @return high
   */
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   }   
   /** Compares low temps.
   *   @param lowIn low
   *   @return low
   */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   /** Compares high temps.
   *   @param highIn high
   *   @return high
   */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   /** toString method.
   *   @return toString
   */
   public String toString() {
      return "\tTemperatures: " + temperatures + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
}
