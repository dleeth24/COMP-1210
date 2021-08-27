/**
* This program is the InventoryItem.
*
* Activity 9
* @author Davis Leeth - COMP 1213
* @version 3/30/21
*/
public class InventoryItem {
   protected String name;
   protected double price;
   private static double taxRate = 0;
   
   /** This constructor method initializes the given info to its
   *   appropriate variable.
   *   @param nameIn name
   *   @param priceIn price
   */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }
   /** Gets the name.
   *   @return name
   */
   public String getName() {
      return name;
   }
   /** Calculates the cost.
   *   @return cost
   */   
   public double calculateCost() {
      return price * (1 + taxRate);
   }
   /** Sets the tax rate.
   *   @param taxRateIn tax
   */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   /** toString method.
   *   @return toString
   */   
   public String toString() {
      return name + ": $" + calculateCost();
   }
}