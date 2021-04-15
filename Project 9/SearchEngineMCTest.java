import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** Tests the SearchEngineMC class. */
public class SearchEngineMCTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Tests the getBaseCost method. **/
   @Test public void getBaseCostTest() {
      SearchEngineMC mc2 = new SearchEngineMC("Web Ads 2",
         27500.00, 2.50, 5000);
      Assert.assertEquals(2000.0, mc2.getBaseCost(), 0.01);
   }
}
