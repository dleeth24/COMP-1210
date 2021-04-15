import java.util.Scanner;

/**
* This program takes input values of type double for x, y, and z
* and plugs them into a given expression as long as xyz does not 
* equal zero.
*
* Project 2
* @author Davis Leeth - COMP 1213
* @version 1/26/21
*/
public class ExpressionSolver 
{
/**
* Prints the expression, numbers, and result.
* @param args Command line arguments – not used.
*/
   public static void main(String[]args)
   {
      Scanner userInput = new Scanner(System.in);
      double x, y, z, result;
      System.out.println("result = (9x + 6.25) (6y - 4.5) (3z + 2.75)"
         + " / xyz");
      System.out.print("\tx = ");
      x = userInput.nextDouble();
      System.out.print("\ty = ");
      y = userInput.nextDouble();
      System.out.print("\tz = ");
      z = userInput.nextDouble();
      if (x * y * z == 0)
      {
         System.out.println("result is \"undefined\"");
      }
      else
      {
         result = (9 * x + 6.25) * (6 * y - 4.5) * (3 * z + 2.75) 
            / (x * y * z);
         System.out.println("result = " + result);
      }
      
   }
}
