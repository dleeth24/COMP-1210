import java.io.FileNotFoundException;
/**
* This is the class that contains the main method.
*
* Project 11
* @author Davis Leeth - COMP 1213
* @version 4/14/21
*/
public class MarketingCampaignPart3 {
   /**
   * This is the main method.
   * @param args Command line arguments.
   */
   public static void main(String[] args) {
      if (args.length == 0) {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      }
      else {
         String fileName = args[0];
         try {
            MarketingCampaignList list = new MarketingCampaignList();
            list.readFile(fileName);
            System.out.println(list.generateReport() + "\n");
            System.out.println(list.generateReportByName() + "\n");
            System.out.println(list.generateReportByCampaignCost() + "\n");
            System.out.println(list.generateReportByROI() + "\n");
            System.out.println(list.generateInvalidRecordsReport());
         }
         catch (FileNotFoundException e) {
            System.out.println("*** Attempted to read file: " + fileName
               + " (No such file or directory)");
         }
      }
   
   }
}