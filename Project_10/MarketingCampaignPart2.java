import java.io.FileNotFoundException;
/**
* This is the class that contains the main method.
*
* Project 10
* @author Davis Leeth - COMP 1213
* @version 4/8/21
*/
public class MarketingCampaignPart2 {
   /**
   * This is the main method.
   * @param args Command line arguments.
   * @throws FileNotFoundException file
   */
   public static void main(String[] args) throws FileNotFoundException {
      if (args.length == 0) {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      }
      else {
         MarketingCampaignList list = new MarketingCampaignList();
         list.readFile(args[0]);
         
         System.out.println(list.generateReport() + "\n");
         System.out.println(list.generateReportByName() + "\n");
         System.out.println(list.generateReportByCampaignCost() + "\n");
         System.out.println(list.generateReportByROI() + "\n");
                     
      }
   }
}