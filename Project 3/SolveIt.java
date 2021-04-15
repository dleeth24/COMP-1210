import java.util.Scanner;
import java.text.DecimalFormat;

/**
* This program takes a value for 'x' from user input and puts it
* through a specified expression. It also says how many characters
* are to the left and right of the decimal point.
*
* Project 3
* @author Davis Leeth - COMP 1213
* @version 2/3/21
*/
public class SolveIt 
{
/**
* Prints the value, result, and decimal information.
* @param args Command line arguments – not used.
*/
   public static void main(String[]args)
   {
      Scanner userInput = new Scanner(System.in);
      double x = 0;
      double result = 0;
      double top = 0;
      double bottom = 0;
      int leftOfDecimal = 0;
      int rightOfDecimal = 0;
      String answer = "";
      String format = "";
      DecimalFormat decimalFormat = new DecimalFormat("#,##0.0##");
      System.out.print("Enter a value for x: ");
      x = Double.parseDouble(userInput.nextLine());
      top = 6 * (Math.pow(x, 3)) 
         + (Math.sqrt((3 * (x * x)) + (2 * x) + 1));
      bottom = Math.abs(2 * x) + 4;
      result = top / bottom;
      System.out.println("Result: " + result);
      answer = Double.toString(result);
      leftOfDecimal = answer.indexOf(".");
      rightOfDecimal = answer.length() - leftOfDecimal - 1;
      System.out.println("# of characters to left of decimal point: "
         + leftOfDecimal);
      System.out.println("# of characters to right of decimal point: "
         + rightOfDecimal);
      format = decimalFormat.format(result);
      System.out.println("Formatted Result: " + format);
      
   }
}
