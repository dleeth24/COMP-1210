import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** Tests the DirectMC class. **/
public class DirectMCTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Tests the getCostPerMailPiece method. **/
   @Test public void getCostPerMailPieceTest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      Assert.assertEquals(3.00, mc0.getCostPerMailPiece(), 0.00001);
   }
   
   /** Tests the setCostPerMailPiece method. **/
   @Test public void setCostPerMailPieceTest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      mc0.setCostPerMailPiece(5.00);
      Assert.assertEquals(5.00, mc0.getCostPerMailPiece(), 0.00001);
   }
   
   /** Tests the getNumberOfMailPieces method. **/
   @Test public void getNumberOfMailPiecesTest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      Assert.assertEquals(2000, mc0.getNumberOfMailPieces());
   }
   
   /** Tests the setNumberOfMailPieces method. **/
   @Test public void setNumberOfMailPiecesTest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      mc0.setNumberOfMailPieces(500);
      Assert.assertEquals(500, mc0.getNumberOfMailPieces());
   }
   
   /** Tests the campaignCost method. **/
   @Test public void campaignCostTest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      Assert.assertEquals(7000.00, mc0.campaignCost(), 0.001);
   }
   
   /** Tests the mailCost method. **/
   @Test public void mailCostTest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      Assert.assertEquals(6000.00, mc0.mailCost(), 0.001);
   }
   
   /** Tests the toString method. **/
   @Test public void toStringTest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      Assert.assertEquals("Ad Mailing (class DirectMC)\nRevenue: $10,000.00   "
         + "Campaign Cost: $7,000.00   ROI: 42.86%\n   Base Cost: $1,000.00\n"
         + "   Mail Cost: $6,000.00 = $3.00 per mail piece * 2000 mail pieces",
         mc0.toString());
   }
   
   /** Tests the getName method. **/
   @Test public void getNameTest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      Assert.assertEquals("Ad Mailing", mc0.getName());
   }
   
   /** Tests the setName method. **/
   @Test public void setNameTest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      mc0.setName("New Ad Mailing");
      Assert.assertEquals("New Ad Mailing", mc0.getName());
   }
   
   /** Tests the getRevenue method. **/
   @Test public void getRevenueTest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      Assert.assertEquals(10000.00, mc0.getRevenue(), 0.00001);
   }
   
   /** Tests the setRevenue method. **/
   @Test public void setRevenueTest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      mc0.setRevenue(5000.00);
      Assert.assertEquals(5000.00, mc0.getRevenue(), 0.00001);
   }
   
   /** Tests the getCount method. **/
   @Test public void getCountTest() {
      MarketingCampaign.resetCount();
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      Assert.assertEquals(1, mc0.getCount());
   }
   
   /** Tests the resetCount method. **/
   @Test public void resetCountTest() {
      MarketingCampaign.resetCount();
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      MarketingCampaign.resetCount();
      Assert.assertEquals(0, mc0.getCount());
   }
   
   /** Tests the calcROI method. **/
   @Test public void calcROITest() {
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      Assert.assertEquals(.4286, mc0.calcROI(), 0.01);
   }
   
   
}
