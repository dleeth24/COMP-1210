import java.text.DecimalFormat;
/**
* This class creates a TetrahedronList and has various methods that
* change the tetrahedron and access it.
*
* Project 8
* @author Davis Leeth - COMP 1213
* @version 3/25/21
*/
public class TetrahedronList {

   private String name = "";
   private Tetrahedron[] tetraList;
   private int tetraCount = 0;
   /** This constructor method initializes the given info to its
   *   appropriate variable.
   *   @param nameIn name
   *   @param tetraListIn list
   *   @param tetraCountIn count
   */
   public TetrahedronList(String nameIn, Tetrahedron[] tetraListIn,
      int tetraCountIn) {
      name = nameIn;
      tetraList = tetraListIn;
      tetraCount = tetraCountIn;
   }
   /** Gets name.
   *   @return name
   */
   public String getName() {
      return name;
   }
   /** Returns number of tetrahedrons.
   *   @return tetraCount
   */
   public int numberOfTetrahedrons() {
      return tetraCount;
   }
   /** Returns total surface area.
   *   @return total
   */
   public double totalSurfaceArea() {
      double total = 0;
      for (int i = 0; i < tetraList.length; i++) {
         total += tetraList[i].surfaceArea();
      }
      return total;
   }
   /** Returns total volume.
   *   @return total
   */
   public double totalVolume() {
      double total = 0;
      for (int i = 0; i < tetraList.length; i++) {
         total += tetraList[i].volume();
      }
      return total;
   }
   /** Returns average surface area.
   *   @return avg
   */
   public double averageSurfaceArea() {
      double total = 0;
      double avg = 0;
      for (int i = 0; i < tetraList.length; i++) {
         total += tetraList[i].surfaceArea();
      }
      avg = total / tetraCount;
      return avg;
   }
   /** Returns average volume.
   *   @return avg
   */
   public double averageVolume() {
      double total = 0;
      double avg = 0;
      for (int i = 0; i < tetraList.length; i++) {
         total += tetraList[i].volume();
      }
      avg = total / tetraCount;
      return avg;
   }
   /** toString method.
   *   @return toString
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      return "----- Summary for " + name + " -----\nNumber of Tetrahedrons: "
         + tetraCount + "\nTotal Surface Area: " + df.format(totalSurfaceArea())
         + " square units\nTotal Volume: " + df.format(totalVolume())
         + " cubic units\nAverage Surface Area: "
         + df.format(averageSurfaceArea()) + " square units\nAverage Volume: "
         + df.format(averageVolume()) + " cubic units";
   }
   /** Gets list.
   *   @return tetraList
   */
   public Tetrahedron[] getList() {
      return tetraList;
   }
   /** Adds tetrahedron.
   *   @param labelIn label
   *   @param edgeIn edge
   */
   public void addTetrahedron(String labelIn, double edgeIn) {
      Tetrahedron[] temp = new Tetrahedron[tetraCount + 1];
      Tetrahedron tempObj = new Tetrahedron(labelIn, edgeIn);
      for (int i = 0; i < tetraCount - 1; i++) {
         temp[i] = tetraList[i];
      }
      tetraCount++;
      temp[tetraCount - 1] = tempObj;
      tetraList = temp;
   }
   /** Finds tetrahedron.
   *   @return tetraList
   *   @param label label
   */
   public Tetrahedron findTetrahedron(String label) {
      if (tetraCount > 0) {
      
         for (int i = 0; i < tetraList.length; i++) {
            if (label.equalsIgnoreCase(tetraList[i].getLabel())) {
               return tetraList[i];
            }
         }
         return null;
      }
      else {
         return null;
      }
   }
   /** Deletes tetrahedron.
   *   @return answer
   *   @param label label
   */
   public Tetrahedron deleteTetrahedron(String label) {
      Tetrahedron[] copy = new Tetrahedron[1];
      for (int i = 0; i < tetraCount; i++) {
         if (label.equalsIgnoreCase(tetraList[i].getLabel())) {
            copy[0] = findTetrahedron(label);
            for (int j = i; j < tetraCount - 1; j++) {
               tetraList[j] = tetraList[j + 1];
            }
            tetraList[tetraCount - 1] = null;
            tetraCount--;
         }
      }
      return copy[0];
   }
   /** Edits tetrahedron.
   *   @return boolean
   *   @param labelIn label
   *   @param edgeIn edge
   */
   public boolean editTetrahedron(String labelIn, double edgeIn) {
      if (tetraCount > 0) {
         boolean result = false;
         for (int i = 0; i < tetraCount; i++) {
            if (labelIn.equalsIgnoreCase(tetraList[i].getLabel())) {
               tetraList[i].setEdge(edgeIn);
               result = true;
               break;
            }
         }
         return result;
      }
      else {
         return false;
      }
   }
   /** Finds the tetrahedron with the largest volume.
   *   @return answer
   */
   public Tetrahedron findTetrahedronWithLargestVolume() {
      if (tetraCount == 0) {
         return null;
      }
      else {
         double largest = 0;
         int location = 0;
         Tetrahedron answer = tetraList[0];
         for (int i = 0; i < tetraCount; i++) {
            if (tetraList[i].volume() > largest) {
               largest = tetraList[i].volume();
               location = i;
            }
         }
         return tetraList[location];
      }
   }

}