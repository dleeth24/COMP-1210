import java.util.Scanner;

/**
* This program takes an amount of petroleum in ounces under 1 billion
* and displays the number of barrels, gallons, quarts, and ounces that
* the given amount of petroleum equals to.
*
* Project 2
* @author Davis Leeth - COMP 1213
* @version 1/27/21
*/
public class PetroleumUnits 
{
/**
* Prints the amount entered, each unit, and the equation.
* @param args Command line arguments – not used.
*/
   public static void main(String[]args)
   {
      Scanner userInput = new Scanner(System.in);
      int ounces = 0;
      int barrels = 0;
      int gallons = 0;
      int quarts = 0;
      int originalOz = 0;
      System.out.print("Enter amount of petroleum in ounces: ");
      ounces = userInput.nextInt();
      originalOz = ounces;
      if (ounces > 1000000000)
      {
         System.out.println("Amount must not exceed 1,000,000,000.");
         return;
      }
      else
      {
         System.out.println("Petroleum amount in units:");
         barrels = ounces / 5376;
         ounces = ounces % 5376;
         gallons = ounces / 128;
         ounces = ounces % 128;
         quarts = ounces / 32;
         ounces = ounces % 32;
         System.out.println("\tBarrels: " + barrels);
         System.out.println("\tGallons: " + gallons);
         System.out.println("\tQuarts: " + quarts);
         System.out.println("\tOunces: " + ounces);
         System.out.println(originalOz + " oz = (" + barrels 
            + " bl * 5376 oz) + (" + gallons + " gal * 128 oz) + ("
            + quarts + " qt * 32 oz) + (" + ounces + " oz)");
      }
   }
}
