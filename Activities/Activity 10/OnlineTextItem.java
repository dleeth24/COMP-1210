/**
* This program is the abstract OnlineTextItem.
*
* Activity 9
* @author Davis Leeth - COMP 1213
* @version 3/30/21
*/
public abstract class OnlineTextItem extends InventoryItem {
   /** This constructor method initializes the given info to its
   *   appropriate variable.
   *   @param nameIn name
   *   @param priceIn price
   */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
   /** Calculates cost.
   *   @return cost
   */
   public double calculateCost() {
      return price;
   }
   
}