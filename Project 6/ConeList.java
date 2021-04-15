import java.text.DecimalFormat;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
* This class stores the list name, and array list. It also includes
* methods which set and get that information and methods to calculate
* totals of the base perimeter, base area, slant height, side area, 
* surface area, and volume of a Cone object as well as a toString method
* and averages of the info along with a summary method.
*
* Project 6
* @author Davis Leeth - COMP 1213
* @version 2/24/21
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
      String result = "\n" + listName + "\n";
      int index = 0;
      while (index < coneList.size()) {
         result += "\n" + coneList.get(index) + "\n"; 
         index++;  
      }   
      return result;
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
   /** Gets the list.
   *   @return coneList
   */
   public ArrayList<Cone> getList() {
      return coneList;
   }
   /** Reads the file.
   *   @return c
   *   @param fileNameIn file
   *   @throws IOException exception
   */
   public ConeList readFile(String fileNameIn) 
      throws IOException {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      ArrayList<Cone> coneTwo = new ArrayList<Cone>();
      String label = "";
      double height = 0;
      double radius = 0;
      listName = scanFile.nextLine();
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         height = Double.parseDouble(scanFile.nextLine());
         radius = Double.parseDouble(scanFile.nextLine());
         coneTwo.add(new Cone(label, height, radius));
      }
      ConeList c = new ConeList(listName, coneTwo);
      return c;
   }
   /** Adds a cone.
   *   @param labelIn label
   *   @param heightIn height
   *   @param radiusIn radius
   */
   public void addCone(String labelIn, double heightIn, double radiusIn) {
      Cone c = new Cone(labelIn, heightIn, radiusIn);
      coneList.add(c);
   }
   /** Finds cone.
   *   @return c
   *   @param labelIn label
   */
   public Cone findCone(String labelIn) {
      for (Cone c : coneList) {
         if (c.getLabel().equalsIgnoreCase(labelIn))
         {
            return c;
         }
      }
      return null;
   }
   /** Deletes cone.
   *   @return coneList
   *   @param labelIn label
   */
   public Cone deleteCone(String labelIn) {
      int index = coneList.indexOf(findCone(labelIn));
      if (index >= 0) {
         return coneList.remove(index);
      }
      else {
         return null;
      }
   
   }
   /** Edit cone.
   *   @return true
   *   @param labelIn label
   *   @param heightIn height
   *   @param radiusIn radius
   */
   public boolean editCone(String labelIn, double heightIn, double radiusIn) {
      int index = coneList.indexOf(findCone(labelIn));
      if (index >= 0) {
         coneList.get(index).setHeight(heightIn);
         coneList.get(index).setRadius(radiusIn);
         return true;
      }
      else {
         return false;
      }
   }
   
   

}