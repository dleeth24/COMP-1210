import java.util.Scanner;
/**
* This program is the driver for Cone.java which contains a main method
* that asks for label, height, and radius from the user. After this, a Cone
* object is created and printed.
*
* Project 4
* @author Davis Leeth - COMP 1213
* @version 2/10/21
*/

public class ConeApp {
/**
* Sets the variables by calling methods from Cone.java
* and prints the information.
* @param args Command line arguments – not used.
*/
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String label = "";
      String height = "";
      String radius = "";
      System.out.println("Enter label, height, and radius for a cone.");
      System.out.print("\tlabel: ");
      label = userInput.nextLine();
      System.out.print("\theight: ");
      height = userInput.nextLine();
      if (Double.parseDouble(height) <= 0) {
         System.out.println("Error: height must be greater than 0.");
         return;
      }
      System.out.print("\tradius: ");
      radius = userInput.nextLine();
      if (Double.parseDouble(radius) <= 0) {
         System.out.println("Error: radius must be greater than 0.");
         return;
      }
      Cone cone1 = new Cone(label, Double.parseDouble(height),
         Double.parseDouble(radius));
      System.out.println(cone1);
   }
}