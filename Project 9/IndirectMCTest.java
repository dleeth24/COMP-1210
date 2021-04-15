import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** Tests the IndirectMC class. */
public class IndirectMCTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Tests the getCostPerAd method. **/
   @Test public void getCostPerAdTest() {
      IndirectMC mc0 = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      Assert.assertEquals(2.0, mc0.getCostPerAd(), 0.00001);
   }
    
    /** Tests the setCostPerAd method. **/
   @Test public void setCostPerMailPieceTest() {
      IndirectMC mc0 = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      mc0.setCostPerAd(5.00);
      Assert.assertEquals(5.00, mc0.getCostPerAd(), 0.00001);
   }
   
   /** Tests the getNumberOfAds method. **/
   @Test public void getNumberOfAdsTest() {
      IndirectMC mc0 = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      Assert.assertEquals(3500, mc0.getNumberOfAds());
   }
    
    /** Tests the setNumberOfAds method. **/
   @Test public void setNumberOfAdsTest() {
      IndirectMC mc0 = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      mc0.setNumberOfAds(2500);
      Assert.assertEquals(2500, mc0.getNumberOfAds());
   }
   
   /** Tests the getBaseCost method. **/
   @Test public void getBaseCostTest() {
      IndirectMC mc0 = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      Assert.assertEquals(1500.0, mc0.getBaseCost(), .001);
   }
   
   /** Tests the campaignCost method. **/
   @Test public void campaignCostTest() {
      IndirectMC mc0 = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      Assert.assertEquals(8500.00, mc0.campaignCost(), 0.001);
   }
   
   /** Tests the adCost method. **/
   @Test public void adCostTest() {
      IndirectMC mc0 = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      Assert.assertEquals(7000.00, mc0.adCost(), 0.001);
   }
   
   /** Tests the toString method. **/
   @Test public void toStringTest() {
      IndirectMC mc0 = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      Assert.assertEquals("Web Ads 1 (class IndirectMC)\nRevenue: $15,000.00   "
         + "Campaign Cost: $8,500.00   ROI: 76.47%\n   Base Cost: $1,500.00\n"
         + "   Ad Cost: $7,000.00 = $2.00 per ad * 3500 ads",
         mc0.toString());
   }
}
