import java.text.DecimalFormat;

/**
* This class stores the label, height, and radius. It also includes
* methods which set and get that information and methods to calculate
* the base perimeter, base area, slant height, side area, surface area,
* and volume of a Cone object as well as a toString method.
*
* Project 4
* @author Davis Leeth - COMP 1213
* @version 2/9/21
*/
public class Cone {
   // instance variables
   private String label;
   private double height;
   private double radius;
   
   // constructor
   /** This constructor method initializes the given info to its
   *   appropriate variable.
   *   @param labelIn label
   *   @param heightIn height
   *   @param radiusIn radius
   */
   public Cone(String labelIn, double heightIn, double radiusIn) {
      setLabel(labelIn);
      setHeight(heightIn);
      setRadius(radiusIn);
   }
   // methods
   /** Gets the label.
   *   @return label
   */
   public String getLabel() {
      return label;
   }
   /** Sets the label.
   *   @return label
   *   @param labelIn label
   */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         labelIn = labelIn.trim();
         label = labelIn;
         return true;
      }
      else {
         return false;
      }
   }
   /** Gets height.
   *   @return height
   */
   public double getHeight() {
      return height;
   }
   /** Sets height.
   *   @return height
   *   @param heightIn height
   */
   public boolean setHeight(double heightIn) {
      if (heightIn > 0) {
         height = heightIn;
         return true;
      }
      else {
         return false;
      }
   }
   /** Gets radius.
   *   @return radius
   */
   public double getRadius() {
      return radius;
   }
   /** Sets radius.
   *   @return radius
   *   @param radiusIn radius
   */
   public boolean setRadius(double radiusIn) {
      if (radiusIn > 0) {
         radius = radiusIn;
         return true;
      }
      else {
         return false;
      }
   }
   /** Calculates base perimeter.
   *   @return perimeter
   */
   public double basePerimeter() {
      double perimeter = (2 * Math.PI * getRadius());
      return perimeter;
   }
   /** Calculates base area.
   *   @return baseArea
   */
   public double baseArea() {
      double baseArea = (Math.PI * (Math.pow(getRadius(), 2)));
      return baseArea;
   }
   /** Calculates slant height.
   *   @return slantHeight
   */
   public double slantHeight() {
      double slantHeight = (Math.sqrt(Math.pow(getRadius(), 2)
         + Math.pow(getHeight(), 2)));
      return slantHeight;
   }
   /** Calculates side area.
   *   @return sideArea
   */
   public double sideArea() {
      double sideArea = (Math.PI * getRadius() * slantHeight());
      return sideArea;
   }
   /** Calculates surface area.
   *   @return surfaceArea
   */
   public double surfaceArea() {
      double surfaceArea = (Math.PI * getRadius() 
         * (getRadius() + slantHeight()));
      return surfaceArea;
   }
   /** Calculates volume.
   *   @return volume
   */
   public double volume() {
      double volume = (Math.PI * (Math.pow(getRadius(), 2)) 
         * (getHeight() / 3));
      return volume;
   }
   /** toString method.
   *   @return toString
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String heightS = df.format(getHeight());
      String radiusS = df.format(getRadius());
      String perimeterS = df.format(basePerimeter());
      String baseAreaS = df.format(baseArea());
      String slantHeightS = df.format(slantHeight());
      String sideAreaS = df.format(sideArea());
      String surfaceAreaS = df.format(surfaceArea());
      String volumeS = df.format(volume());
      return "\"" + getLabel() + "\" is a cone with height = " + heightS
         + " units and radius = " + radiusS + " units,\nwhich has base "
         + "perimeter = " + perimeterS + " units, base area = " + baseAreaS
         + " square units,\nslant height = " + slantHeightS
         + " units, side area = " + sideAreaS 
         + " square units,\nsurface area = "
         + surfaceAreaS + " square units, and volume = "
         + volumeS + " cubic units.";
   }

}