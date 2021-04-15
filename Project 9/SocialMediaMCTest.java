import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** Tests the SocialMediaMC class. */
public class SocialMediaMCTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Tests the getBaseCost method. **/
   @Test public void getBaseCostTest() {
      SocialMediaMC mc3 = new SocialMediaMC("Web Ads 3", 35000.00, 3.00, 8000);
      Assert.assertEquals(3000.0, mc3.getBaseCost(), 0.01);
   }
}
