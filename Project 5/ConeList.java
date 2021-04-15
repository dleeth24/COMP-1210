import java.text.DecimalFormat;
import java.util.ArrayList;

/**
* This class stores the list name, and array list. It also includes
* methods which set and get that information and methods to calculate
* totals of the base perimeter, base area, slant height, side area, 
* surface area, and volume of a Cone object as well as a toString method
* and averages of the info along with a summary method.
*
* Project 5
* @author Davis Leeth - COMP 1213
* @version 2/18/21
*/
public class ConeList {
   private String listName;
   private ArrayList<Cone> coneList = new ArrayList<Cone>();
   
/** This constructor method initializes the given info to its
   *   appropriate variable.
   *   @param listNameIn name
   *   @param coneListIn list
   */
   public ConeList(String listNameIn, ArrayList<Cone> coneListIn) {
      listName = listNameIn;
      coneList = coneListIn;
   }
   /** Gets the name.
   *   @return listName
   */
   public String getName() {
      return listName;
   }
   /** Gets the size.
   *   @return coneList.size()
   */
   public int numberOfCones() {
      return coneList.size();
   }
   /** Gets the total base perimeter.
   *   @return total
   */
   public double totalBasePerimeter() {
      double total = 0;
      int i = 0;
      while (i < coneList.size()) {
         total += coneList.get(i).basePerimeter();
         i++;
      }
      return total;
   }
   /** Gets the total base area.
   *   @return total
   */
   public double totalBaseArea() {
      double total = 0;
      int i = 0;
      while (i < coneList.size()) {
         total += coneList.get(i).baseArea();
         i++;
      }
      return total;
   }
   /** Gets the total slant height.
   *   @return total
   */
   public double totalSlantHeight() {
      double total = 0;
      int i = 0;
      while (i < coneList.size()) {
         total += coneList.get(i).slantHeight();
         i++;
      }
      return total;
   }
   /** Gets the total side area.
   *   @return total
   */
   public double totalSideArea() {
      double total = 0;
      int i = 0;
      while (i < coneList.size()) {
         total += coneList.get(i).sideArea();
         i++;
      }
      return total;
   }
   /** Gets the total surface area.
   *   @return total
   */
   public double totalSurfaceArea() {
      double total = 0;
      int i = 0;
      while (i < coneList.size()) {
         total += coneList.get(i).surfaceArea();
         i++;
      }
      return total;
   }
/** Gets the total volume.
   *   @return total
   */
   public double totalVolume() {
      double total = 0;
      int i = 0;
      while (i < coneList.size()) {
         total += coneList.get(i).volume();
         i++;
      }
      return total;
   }
/** Gets the average surface area.
   *   @return average
   */
   public double averageSurfaceArea() {
      if (coneList.size() == 0) {
         return 0;
      }
      double average = 0;
      average = totalSurfaceArea() / coneList.size();
      return average;
   }
   /** Gets the average volume.
   *   @return average
   */
   public double averageVolume() {
      if (coneList.size() == 0) {
         return 0;
      }
      double average = 0;
      average = totalVolume() / coneList.size();
      return average;
   }
   /** toString method.
   *   @return toString
   */
   public String toString() {
      String all = "";
      int i = 0;
      while (i < coneList.size()) {
         String name = coneList.get(i).getLabel();
         DecimalFormat df = new DecimalFormat("#,##0.0##");
         String heightS = df.format(coneList.get(i).getHeight());
         String radiusS = df.format(coneList.get(i).getRadius());
         String perimeterS = df.format(coneList.get(i).basePerimeter());
         String baseAreaS = df.format(coneList.get(i).baseArea());
         String slantHeightS = df.format(coneList.get(i).slantHeight());
         String sideAreaS = df.format(coneList.get(i).sideArea());
         String surfaceAreaS = df.format(coneList.get(i).surfaceArea());
         String volumeS = df.format(coneList.get(i).volume());
         i++;
         all += "\"" + name + "\" is a cone with height = " + heightS
            + " units and radius = " + radiusS + " units,\nwhich has base "
            + "perimeter = " + perimeterS + " units, base area = " + baseAreaS
            + " square units,\nslant height = " + slantHeightS
            + " units, side area = " + sideAreaS 
            + " square units,\nsurface area = "
            + surfaceAreaS + " square units, and volume = "
            + volumeS + " cubic units.\n\n";
      }
      return all;
   }
   /** summaryInfo method.
   *   @return summaryInfo
   */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String perimeterS = df.format(totalBasePerimeter());
      String baseAreaS = df.format(totalBaseArea());
      String slantHeightS = df.format(totalSlantHeight());
      String sideAreaS = df.format(totalSideArea());
      String surfaceAreaS = df.format(totalSurfaceArea());
      String volumeS = df.format(totalVolume());
      String avgSAS = df.format(averageSurfaceArea());
      String avgVS = df.format(averageVolume());
      return "----- Summary for " + getName() + " -----" + "\nNumber of Cones: "
         + coneList.size() + "\nTotal Base Perimeter: " + perimeterS
         + "\nTotal Base Area: " + baseAreaS + "\nTotal Slant Height: "
         + slantHeightS + "\nTotal Side Area: " + sideAreaS 
         + "\nTotal Surface Area: " + surfaceAreaS + "\nTotal Volume: "
         + volumeS + "\nAverage Surface Area: " + avgSAS
         + "\nAverage Volume: " + avgVS;
   }

}