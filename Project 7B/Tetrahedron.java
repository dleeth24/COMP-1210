import java.text.DecimalFormat;

/**
* This class creates a Tetrahedron and has various methods that
* change the tetrahedron and access it.
*
* Project 7
* @author Davis Leeth - COMP 1213
* @version 3/9/21
*/
public class Tetrahedron implements Comparable<Tetrahedron> {

   private String label = "";
   private double edge = 0;
   private static int tetrahedronsCreated = 0;
 /** This constructor method initializes the given info to its
   *   appropriate variable.
   *   @param labelIn label
   *   @param edgeIn edge
   */
   public Tetrahedron(String labelIn, double edgeIn) {
      setLabel(labelIn);
      setEdge(edgeIn);
      tetrahedronsCreated++;
   }
   /** Gets label.
   *   @return label
   */
   public String getLabel() {
      return label;
   }
   /** Sets label.
   *   @param labelIn label
   *   @return boolean
   */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      }
      else {
         return false;
      }
   }
   /** Gets edge.
   *   @return edge
   */
   public double getEdge() {
      return edge;
   }
   /** Sets edge.
   *   @param edgeIn edge
   *   @return boolean
   */
   public boolean setEdge(double edgeIn) {
      if (edgeIn >= 0) {
         edge = edgeIn;
         return true;
      }
      else {
         return false;
      }
   }
   /** Gets height.
   *   @return height
   */
   public double height() {
      double height = Math.sqrt(2.0 / 3.0) * getEdge();
      return height;
   }
   /** Gets surface area.
   *   @return surfaceArea
   */
   public double surfaceArea() {
      double surfaceArea = Math.sqrt(3) * Math.pow(getEdge(), 2);
      return surfaceArea;
   }
   /** Gets volume.
   *   @return volume
   */
   public double volume() {
      double volume = Math.pow(getEdge(), 3.0) / (6.0 * Math.sqrt(2.0));
      return volume;
   }
   /** toString method.
   *   @return toString
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      return "Tetrahedron \"" + getLabel() + "\" with six edges of length "
         + df.format(getEdge()) + " has:\n\theight = " + df.format(height())
         + " units\n\tsurface "
         + "area = " + df.format(surfaceArea()) + " square units\n\tvolume = "
         + df.format(volume()) + " cubic units";
   }
   /** Gets count.
   *   @return tetrahedronsCreated
   */
   public static int getCount() {
      return tetrahedronsCreated;
   }
   /** Resets count.
   */
   public static void resetCount() {
      tetrahedronsCreated = 0;
   }
   /** Tests if two objects are equal.
   *   @param obj object
   *   @return boolean
   */
   public boolean equals(Object obj) {
      if (!(obj instanceof Tetrahedron)) {
         return false;
      }
      else {
         Tetrahedron d = (Tetrahedron) obj;
         return (label.equalsIgnoreCase(d.getLabel())
                  && Math.abs(edge - d.getEdge()) < .000001);
      }
   }
   /** Hash code.
   *   @return zero
   */
   public int hashCode() {
      return 0;
   }
   /** Compares two objects.
   *   @param obj obj
   *   @return int
   */
   public int compareTo(Tetrahedron obj) {
      if (Math.abs(this.volume() - obj.volume()) < 0.000001) {
         return 0;
      }
      else if (this.volume() < obj.volume()) {
         return -1;
      }
      else {
         return 1;
      }
   }
}