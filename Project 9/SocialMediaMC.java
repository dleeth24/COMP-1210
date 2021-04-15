/**
* This class creates a SocialMediaMC and has various methods that
* change it and access it.
*
* Project 9
* @author Davis Leeth - COMP 1213
* @version 4/1/21
*/
public class SocialMediaMC extends IndirectMC {
  /** Base Cost. */
   public static final double BASE_COST = 3000.0;
   /** This constructor method initializes the given info to its
   *   appropriate variable.
   *   @param nameIn name
   *   @param revenueIn rev
   *   @param costPerAdIn cost
   *   @param numberOfAdsIn num
   */
   public SocialMediaMC(String nameIn, double revenueIn, double costPerAdIn,
      int numberOfAdsIn) {
      super(nameIn, revenueIn, costPerAdIn, numberOfAdsIn);
   }
   /** Gets the base cost.
   *   @return baseCost
   */
   public double getBaseCost() {
      return BASE_COST;
   }

}