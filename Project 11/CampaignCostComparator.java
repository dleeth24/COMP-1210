import java.util.Comparator;
/**
* This class sorts based on campaign cost.
*
* Project 10
* @author Davis Leeth - COMP 1213
* @version 4/8/21
*/
public class CampaignCostComparator implements Comparator<MarketingCampaign> {
   /** Sorts two MarketingCampaign objects based on cost.
   *   @return sort
   *   @param c1 c1
   *   @param c2 c2
   */
   public int compare(MarketingCampaign c1, MarketingCampaign c2) {
      double c1Cost = c1.campaignCost();
      double c2Cost = c2.campaignCost();
      
      if (c1Cost < c2Cost) {
         return -1;
      }
      else if (c1Cost > c2Cost) {
         return 1;
      }
      else {
         return 0;
      }
   }
}