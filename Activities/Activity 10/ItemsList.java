/**
* This program is the ItemsList class.
*
* Activity 10
* @author Davis Leeth - COMP 1213
* @version 4/6/21
*/
public class ItemsList {
   private InventoryItem[] inventory;
   private int count;
   /** This constructor method initializes the given info to its
   *   appropriate variable.
   *   
   */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
   /** Adds an item.
   *   @param itemIn item
   */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
   /** Calculates the total.
   *   @param electronicsSurcharge elec
   *   @return total
   */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else {
            total += inventory[i].calculateCost();
         }
      
      }
      return total;
   }
   /** toString method.
   *   @return toString
   */
   public String toString() {
      String output = "All inventory:\n\n";
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
      return output;
   }
}