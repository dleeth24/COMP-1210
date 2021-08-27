/**
* This program is the ElectronicsItem.
*
* Activity 9
* @author Davis Leeth - COMP 1213
* @version 3/30/21
*/
public class ElectronicsItem extends InventoryItem {
   protected double weight;
   /** shipping cost. */
   public static final double SHIPPING_COST = 1.5;
   
   /** This constructor method initializes the given info to its
   *   appropriate variable.
   *   @param nameIn name
   *   @param priceIn price
   *   @param weightIn weight
   */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   /** Calculates cost.
   *   @return cost
   */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }

}