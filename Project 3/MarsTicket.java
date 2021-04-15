import java.util.Scanner;
import java.text.DecimalFormat;

/**
* This program takes coded ticket information from the user and
* prints it into ticket format. The info includes price, discount,
* time, date, seat, and a description of the ticket.
*
* Project 3
* @author Davis Leeth - COMP 1213
* @version 2/4/21
*/
public class MarsTicket 
{
/**
* Prints the formatted ticket information.
* @param args Command line arguments – not used.
*/
   public static void main(String[]args)
   {
      Scanner userInput = new Scanner(System.in);
      String message = "";
      double price = 0;
      double discount = 0;
      double cost = 0;
      String time = "";
      String date = "";
      String seat = "";
      String description = "";
      String priceS = "";
      String discountS = "";
      String costS = "";
      String prizeS = "";
      int prizeNumber = 0;
      DecimalFormat priceDF = new DecimalFormat("$#,##0.00");
      DecimalFormat discountDF = new DecimalFormat("0%");
      DecimalFormat prizeDF = new DecimalFormat("000000");
      System.out.print("Enter ticket code: ");
      message = userInput.nextLine();
      message = message.trim();
      if (message.length() < 27)
      {
         System.out.println();
         System.out.println("*** Invalid Ticket Code ***");
         System.out.println("Ticket code must have at least 27 characters.");
      }
      else {
         priceS = message.substring(0, 9);
         price = Double.parseDouble(priceS);
         price = price / 100;
         priceS = priceDF.format(price);
         discountS = message.substring(9, 11);
         discount = Double.parseDouble(discountS);
         discount = discount / 100;
         discountS = discountDF.format(discount);
         cost = price * (1 - discount);
         costS = priceDF.format(cost);
         time = message.substring(11, 13) + ":" + message.substring(13, 15);
         date = message.substring(15, 17) + "/" + message.substring(17, 19)
            + "/" + message.substring(19, 23);
         seat = message.substring(23, 26);
         description = message.substring(26, message.length());
         prizeNumber = (int) (Math.random() * 1000000);
         prizeS = prizeDF.format(prizeNumber);
         System.out.println();
         System.out.println("Ticket: " + description + "   Date: " + date
            + "   Time: " + time);
         System.out.println("Seat: " + seat + "   Price: " + priceS
            + "   Discount: " + discountS + "   Cost: " + costS);
         System.out.println("Prize Number: " + prizeS);
      
      }
      
   }
}
