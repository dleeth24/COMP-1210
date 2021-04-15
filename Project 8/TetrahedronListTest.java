import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** 
* Tests TetrahedronList.
*/
public class TetrahedronListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Tests the get name method. **/
   @Test public void getNameTest() {
      Tetrahedron a = new Tetrahedron("tet", 3);
      Tetrahedron b = new Tetrahedron("tetra", 5);
      Tetrahedron[] list = {a, b};
      TetrahedronList test = new TetrahedronList("test", list, 2); 
      Assert.assertEquals("test", test.getName());
   }
   
   /** Tests the number of tetrahedrons method. **/
   @Test public void numberOfTetrahedronsTest() {
      Tetrahedron a = new Tetrahedron("tet", 3);
      Tetrahedron b = new Tetrahedron("tetra", 5);
      Tetrahedron[] list = {a, b};
      TetrahedronList test = new TetrahedronList("test", list, 2); 
      Assert.assertEquals(2, test.numberOfTetrahedrons());
   }
   
   /** Tests the total surface area method. **/
   @Test public void totalSurfaceAreaTest() {
      Tetrahedron a = new Tetrahedron("tet", 3);
      Tetrahedron b = new Tetrahedron("tetra", 5);
      Tetrahedron[] list = {a, b};
      TetrahedronList test = new TetrahedronList("test", list, 2); 
      Assert.assertEquals(58.889, test.totalSurfaceArea(), 0.1);
   }
   
   /** Tests the total volume method. **/
   @Test public void totalVolumeTest() {
      Tetrahedron a = new Tetrahedron("tet", 3);
      Tetrahedron b = new Tetrahedron("tetra", 5);
      Tetrahedron[] list = {a, b};
      TetrahedronList test = new TetrahedronList("test", list, 2); 
      Assert.assertEquals(17.913, test.totalVolume(), 0.1);
   }
   
   /** Tests the average surface area method. **/
   @Test public void averageSurfaceAreaTest() {
      Tetrahedron a = new Tetrahedron("tet", 3);
      Tetrahedron b = new Tetrahedron("tetra", 5);
      Tetrahedron[] list = {a, b};
      TetrahedronList test = new TetrahedronList("test", list, 2); 
      Assert.assertEquals(29.445, test.averageSurfaceArea(), 0.1);
   }
   
   /** Tests the average volume method. **/
   @Test public void averageVolumeTest() {
      Tetrahedron a = new Tetrahedron("tet", 3);
      Tetrahedron b = new Tetrahedron("tetra", 5);
      Tetrahedron[] list = {a, b};
      TetrahedronList test = new TetrahedronList("test", list, 2); 
      Assert.assertEquals(8.957, test.averageVolume(), 0.1);
   }
   
   /** Tests the toString method. **/
   @Test public void toStringTest() {
      Tetrahedron a = new Tetrahedron("tet", 3);
      Tetrahedron b = new Tetrahedron("tetra", 5);
      Tetrahedron[] list = {a, b};
      TetrahedronList test = new TetrahedronList("test", list, 2); 
      Assert.assertEquals("----- Summary for test -----\n"
         + "Number of Tetrahedrons: "
         + "2\nTotal Surface Area: 58.89"
         + " square units\nTotal Volume: 17.913"
         + " cubic units\nAverage Surface Area: "
         + "29.445 square units\nAverage Volume: "
         + "8.957 cubic units", test.toString());
   }
   
   /** Tests the get list method. **/
   @Test public void getListTest() {
      Tetrahedron a = new Tetrahedron("tet", 3);
      Tetrahedron b = new Tetrahedron("tetra", 5);
      Tetrahedron c = new Tetrahedron("tet", 3);
      Tetrahedron d = new Tetrahedron("tetra", 5);
      Tetrahedron[] list = {a, b};
      Tetrahedron[] list2 = {c, d};
      TetrahedronList test = new TetrahedronList("test", list, 2); 
      Assert.assertEquals(list2, test.getList());
   }
   
   /** Tests the add tetrahedron method. **/
   @Test public void addTetrahedronTest() {
      Tetrahedron a = new Tetrahedron("tet", 3);
      Tetrahedron b = new Tetrahedron("tetra", 5);
      Tetrahedron[] list = {a, b};
      TetrahedronList test = new TetrahedronList("test", list, 2); 
      test.addTetrahedron("new", 4);
      Assert.assertEquals(3, test.numberOfTetrahedrons());
   }
   
   /** Tests the find tetrahedron method. **/
   @Test public void findTetrahedronTest() {
      Tetrahedron a = new Tetrahedron("tet", 3);
      Tetrahedron b = new Tetrahedron("tetra", 5);
      Tetrahedron[] list = {a, b};
      TetrahedronList test = new TetrahedronList("test", list, 2);
      Assert.assertEquals(a, test.findTetrahedron("tet"));
   }

   /** Tests the delete tetrahedron method. **/
   @Test public void deleteTetrahedronTest() {
      Tetrahedron a = new Tetrahedron("tet", 3);
      Tetrahedron b = new Tetrahedron("tetra", 5);
      Tetrahedron c = new Tetrahedron("tetras", 4);
      Tetrahedron[] list = {a, b, c};
      TetrahedronList test = new TetrahedronList("test", list, 3);
      test.deleteTetrahedron("tetras");
      Assert.assertEquals(2, test.numberOfTetrahedrons());
   }
   
   /** Tests the edit tetrahedron method. **/
   @Test public void editTetrahedronTest() {
      Tetrahedron a = new Tetrahedron("tet", 3);
      Tetrahedron b = new Tetrahedron("tetra", 5);
      Tetrahedron c = new Tetrahedron("tetras", 4);
      Tetrahedron[] list = {a, b, c};
      TetrahedronList test = new TetrahedronList("test", list, 3);
      test.editTetrahedron("tetras", 0.5);
      Assert.assertEquals(0.408, list[2].height(), .001);
   }
   
   /** Tests the find tetrahedron with largest volume method. **/
   @Test public void findTetrahedronWithLargestVolumeTest() {
      Tetrahedron a = new Tetrahedron("tet", 3);
      Tetrahedron b = new Tetrahedron("tetra", 5);
      Tetrahedron c = new Tetrahedron("tetras", 4);
      Tetrahedron[] list = {a, b, c};
      TetrahedronList test = new TetrahedronList("test", list, 3);
      test.editTetrahedron("tetras", 0.5);
      Assert.assertEquals(b, test.findTetrahedronWithLargestVolume());
   }


}
