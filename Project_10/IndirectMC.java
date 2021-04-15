import java.text.DecimalFormat;
/**
* This class creates a IndirectMC and has various methods that
* change it and access it.
*
* Project 9
* @author Davis Leeth - COMP 1213
* @version 4/1/21
*/
public class IndirectMC extends MarketingCampaign {
   protected double costPerAd;
   protected int numberOfAds;
   /** Base cost. */
   public static final double BASE_COST = 1500.0;
   /** This constructor method initializes the given info to its
   *   appropriate variable.
   *   @param nameIn name
   *   @param revenueIn rev
   *   @param costPerAdIn cost
   *   @param numberOfAdsIn num
   */
   public IndirectMC(String nameIn, double revenueIn, double costPerAdIn,
      int numberOfAdsIn) {
      super(nameIn, revenueIn);
      costPerAd = costPerAdIn;
      numberOfAds = numberOfAdsIn;
   }
   /** Gets the cost per ad.
   *   @return costPerAd
   */
   public double getCostPerAd() {
      return costPerAd;
   }
   /** Sets the cost per ad.
   *   @param costPerAdIn cost
   */
   public void setCostPerAd(double costPerAdIn) {
      costPerAd = costPerAdIn;
   }
   /** Gets the number of ads.
   *   @return numberOfAds
   */
   public int getNumberOfAds() {
      return numberOfAds;
   }
   /** Sets the number of ads.
   *   @param numberOfAdsIn num
   */
   public void setNumberOfAds(int numberOfAdsIn) {
      numberOfAds = numberOfAdsIn;
   }
   /** Gets the base cost.
   *   @return baseCost
   */
   public double getBaseCost() {
      return BASE_COST;
   }
   /** Gets the campaign cost.
   *   @return campaignCost
   */
   public double campaignCost() {
      return getBaseCost() + (costPerAd * numberOfAds);
   }
   /** Gets the ad cost.
   *   @return adCost
   */
   public double adCost() {
      return costPerAd * numberOfAds;
   }
   /** toString method.
   *   @return toString
   */
   public String toString() {
      DecimalFormat dfM = new DecimalFormat("$#,##0.00");
      return super.toString() + "\n   Base Cost: " + dfM.format(getBaseCost())
         + "\n   Ad Cost: " + dfM.format(adCost()) + " = " 
         + dfM.format(costPerAd)
         + " per ad * " + numberOfAds + " ads";
   }
}