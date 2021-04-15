import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** 
* Tests Tetrahedron.
*/
public class TetrahedronTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Tests the get and set label methods. **/
   @Test public void theLabelTest() {
      Tetrahedron t = new Tetrahedron("Small Example", 0.5);
      Tetrahedron b = new Tetrahedron("Big Example", 5.4);
      t.setLabel("This Example");
      Assert.assertEquals("This Example", t.getLabel());
      Assert.assertEquals(false, b.setLabel(null));
   }
   
   /** Tests the get and set edge methods. **/
   @Test public void theEdgeTest() {
      Tetrahedron t = new Tetrahedron("Small Example", 0.5);
      t.setEdge(5.0);
      Assert.assertEquals(5.0, t.getEdge(), .000001);
      Assert.assertEquals(false, t.setEdge(-4.0));
   }
   
   /** Tests the height method. **/
   @Test public void heightTest() {
      Tetrahedron t = new Tetrahedron("Small Example", 0.5);
      Assert.assertEquals(0.408, t.height(), .001);
   }
   
   /** Tests the surfaceArea method. **/
   @Test public void surfaceAreaTest() {
      Tetrahedron t = new Tetrahedron("Small Example", 0.5);
      Assert.assertEquals(0.433, t.surfaceArea(), .001);
   }
   
   /** Tests the volume method. **/
   @Test public void volumeTest() {
      Tetrahedron t = new Tetrahedron("Small Example", 0.5);
      Assert.assertEquals(0.015, t.volume(), .001);
   }
   
   /** Tests the toString method. **/
   @Test public void toStringTest() {
      Tetrahedron t = new Tetrahedron("Small Example", 0.5);
      Assert.assertEquals("Tetrahedron \"Small Example\" with six edges"
         + " of length 0.5 has:\n\theight = 0.408 units\n\tsurface area ="
         + " 0.433 square units\n\tvolume = 0.015 cubic units", t.toString());
   }
   
   /** Tests the getCount method. **/
   @Test public void getCountTest() {
      Tetrahedron.resetCount();
      Tetrahedron d = new Tetrahedron("Big Example", 5.3);
      Assert.assertEquals(1, Tetrahedron.getCount());
   }
   
   /** Tests the resetCount method. **/
   @Test public void resetCountTest() {
      Tetrahedron.resetCount();
      Assert.assertEquals(0, Tetrahedron.getCount());
   }
   
   /** Tests the resetCount method. **/
   @Test public void equalsTest() {
      Tetrahedron a = new Tetrahedron("Small Example", 0.5);
      Tetrahedron b = new Tetrahedron("Small Example", 0.5);
      Tetrahedron c = new Tetrahedron("Big Example", 5.3);
      Tetrahedron d = new Tetrahedron("Small Example", 0.8);
      Tetrahedron e = new Tetrahedron("test", 0.5);
      Object obj = new Object();
      Assert.assertEquals(false, a.equals(obj));
      Assert.assertEquals(true, a.equals(b));
      Assert.assertEquals(false, a.equals(c));
      Assert.assertEquals(false, a.equals(d));
      Assert.assertEquals(false, a.equals(e));
   }
   /** Tests the hashCode method. **/
   @Test public void hashCodeTest() {
      Tetrahedron a = new Tetrahedron("Small Example", 0.5);
      Assert.assertEquals(0, a.hashCode());
   }
   
   /** Tests the compareTo method. **/
   @Test public void compareToTest1() {
      Tetrahedron tet1 = new Tetrahedron("Tetra", 5);
      Tetrahedron tet2 = new Tetrahedron("Tetra", 5);
      Assert.assertTrue(tet1.compareTo(tet2) == 0);
   }
   
   /** Tests the compareTo method. **/
   @Test public void compareToTest2() {
      Tetrahedron tet1 = new Tetrahedron("Tetra", 5);
      Tetrahedron tet2 = new Tetrahedron("Tetra", 7);
      Assert.assertTrue(tet1.compareTo(tet2) < 0);
   }
   
   /** Tests the compareTo method. **/
   @Test public void compareToTest3() {
      Tetrahedron tet1 = new Tetrahedron("Tetra", 5);
      Tetrahedron tet2 = new Tetrahedron("Tetra", 3);
      Assert.assertTrue(tet1.compareTo(tet2) > 0);
   }

}
