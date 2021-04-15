import java.text.DecimalFormat;
/**
* This class creates a Marketing Campaign and has various methods that
* change it and access it.
*
* Project 9
* @author Davis Leeth - COMP 1213
* @version 4/1/21
*/
public abstract class MarketingCampaign 
   implements Comparable<MarketingCampaign> {
   protected String name;
   protected double revenue;
   protected static int count = 0;
   /** This constructor method initializes the given info to its
   *   appropriate variable.
   *   @param nameIn name
   *   @param revenueIn rev
   */
   public MarketingCampaign(String nameIn, double revenueIn) {
      name = nameIn;
      revenue = revenueIn;
      count++;
   }
   /** Gets the name.
   *   @return name
   */
   public String getName() {
      return name;
   }
   /** Sets name.
   *   @param nameIn name
   */
   public void setName(String nameIn) {
      name = nameIn;
   }
   /** Gets the revenue.
   *   @return revenue
   */
   public double getRevenue() {
      return revenue;
   }
   /** Sets revenue.
   *   @param revenueIn revenue
   */
   public void setRevenue(double revenueIn) {
      revenue = revenueIn;
   }
   /** Gets the count.
   *   @return count
   */
   public static int getCount() {
      return count;
   }
   /** Resets the count. */
   public static void resetCount() {
      count = 0;
   }
   /** Calculates the ROI.
   *   @return ROI
   */
   public double calcROI() {
      return (revenue - campaignCost()) / campaignCost();
   }
   /** toString method.
   *   @return toString
   */
   public String toString() {
      DecimalFormat dfM = new DecimalFormat("$#,##0.00");
      DecimalFormat dfROI = new DecimalFormat("0.##%");
      return getName() + " (" + this.getClass() + ")\nRevenue: "
         + dfM.format(getRevenue()) + "   Campaign Cost: "
         + dfM.format(campaignCost())
         + "   ROI: " + dfROI.format(calcROI());
   }
   /** Gets campaign cost. 
   *   @return campaign
   */
   public abstract double campaignCost();
   /** Compares MarketingCampaign objects.
   *   @return compare
   *   @param object obj
   */
   public int compareTo(MarketingCampaign object) {
      return this.getName().toLowerCase().compareTo(object.getName()
         .toLowerCase());
   }
}