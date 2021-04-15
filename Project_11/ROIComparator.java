import java.util.Comparator;
/**
* This class sorts based on ROI.
*
* Project 10
* @author Davis Leeth - COMP 1213
* @version 4/8/21
*/
public class ROIComparator implements Comparator<MarketingCampaign> {
   /** Sorts two MarketingCampaign objects based on ROI.
   *   @return sort
   *   @param c1 c1
   *   @param c2 c2
   */
   public int compare(MarketingCampaign c1, MarketingCampaign c2) {
      double c1ROI = c1.calcROI();
      double c2ROI = c2.calcROI();
      
      if (c1ROI > c2ROI) {
         return -1;
      }
      else if (c1ROI < c2ROI) {
         return 1;
      }
      else {
         return 0;
      }
   }
}