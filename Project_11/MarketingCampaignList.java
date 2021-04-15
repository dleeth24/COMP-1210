import java.util.Arrays;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.NoSuchElementException;
/**
* This class creates a Marketing Campaign List and has various methods 
* that change it and access it.
*
* Project 11
* @author Davis Leeth - COMP 1213
* @version 4/13/21
*/
public class MarketingCampaignList {
   private MarketingCampaign[] markArray;
   private String[] invalids;
   /** This constructor method initializes the given info to its
   *   appropriate variable.
   */
   public MarketingCampaignList() {
      markArray = new MarketingCampaign[0];
      invalids = new String[0];
   }
   /** Gets the marketing campaign array.
   *   @return markArray
   */
   public MarketingCampaign[] getMarketingCampaignArray() {
      return markArray;
   }
   /** Gets the invalid records array.
   *   @return invalids
   */
   public String[] getInvalidRecordsArray() {
      return invalids;
   }
   /** Adds to the marketing campaign list.
   *   @param objIn obj
   */
   public void addMarketingCampaign(MarketingCampaign objIn) {
      markArray = Arrays.copyOf(markArray, markArray.length + 1);
      markArray[markArray.length - 1] = objIn;
   }
   /** Adds to the invalid record list.
   *   @param objIn obj
   */
   public void addInvalidRecord(String objIn) {
      invalids = Arrays.copyOf(invalids, invalids.length + 1);
      invalids[invalids.length - 1] = objIn;
   }
   /** Reads the file.
   *   @param fileNameIn file
   *   @throws FileNotFoundException file
   */
   public void readFile(String fileNameIn)
      throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      String input = "";
      while (scanFile.hasNext()) {
         input = scanFile.nextLine();
         Scanner lineScan = new Scanner(new String(input));
         lineScan.useDelimiter(",");
         char category = lineScan.next().toUpperCase().charAt(0);
         int numberOfAds;
         String name;
         double revenue;
         int numberOfMailPieces;
         double costOfAd;
         double costPerMail;
         
         switch (category) {
            case 'D':
               try {
                  name = lineScan.next();
                  revenue = Double.parseDouble(lineScan.next());
                  costPerMail = Double.parseDouble(lineScan.next());
                  numberOfMailPieces = Integer.parseInt(lineScan.next());
                  DirectMC direct = new DirectMC(name, revenue,
                     costPerMail, numberOfMailPieces);
                  addMarketingCampaign(direct);
               }
               catch (NumberFormatException e) {
                  String result = input + "\n" + e;
                  addInvalidRecord(result);
               }
               catch (NoSuchElementException e) {
                  String result = input + "\n" + e + ": For missing input data";
                  addInvalidRecord(result);
               }
               break;
            case 'I':
               try {
                  name = lineScan.next();
                  revenue = Double.parseDouble(lineScan.next());
                  costOfAd = Double.parseDouble(lineScan.next());
                  numberOfAds = Integer.parseInt(lineScan.next());
                  IndirectMC indirect = new IndirectMC(name, revenue,
                     costOfAd, numberOfAds);
                  addMarketingCampaign(indirect);
               }
               catch (NumberFormatException e) {
                  String result = input + "\n" + e;
                  addInvalidRecord(result);
               }
               catch (NoSuchElementException e) {
                  String result = input + "\n" + e + ": For missing input data";
                  addInvalidRecord(result);
               }
               break;
            case 'S':
               try {
                  name = lineScan.next();
                  revenue = Double.parseDouble(lineScan.next());
                  costOfAd = Double.parseDouble(lineScan.next());
                  numberOfAds = Integer.parseInt(lineScan.next());
                  SearchEngineMC search = new SearchEngineMC(name, revenue,
                     costOfAd, numberOfAds);
                  addMarketingCampaign(search);
               }
               catch (NumberFormatException e) {
                  String result = input + "\n" + e;
                  addInvalidRecord(result);
               }
               catch (NoSuchElementException e) {
                  String result = input + "\n" + e + ": For missing input data";
                  addInvalidRecord(result);
               }
               break;
            case 'M':
               try {
                  name = lineScan.next();
                  revenue = Double.parseDouble(lineScan.next());
                  costOfAd = Double.parseDouble(lineScan.next());
                  numberOfAds = Integer.parseInt(lineScan.next());
                  SocialMediaMC social = new SocialMediaMC(name, revenue,
                     costOfAd, numberOfAds);
                  addMarketingCampaign(social);
               }
               catch (NumberFormatException e) {
                  String result = input + "\n" + e;
                  addInvalidRecord(result);
               }
               catch (NoSuchElementException e) {
                  String result = input + "\n" + e + ": For0-=;'; missing input data";
                  addInvalidRecord(result);
               }
               break;
            default:
               InvalidCategoryException e = new 
                  InvalidCategoryException(String.valueOf(category));
               String result = input + "\n" + e;
               addInvalidRecord(result);
               break;
         }
      }
      scanFile.close();
   }
   /** Generates the report.
   *   @return report
   */
   public String generateReport() {
      String report = "";
      report += "-------------------------------\nMarketing Campaign Report"
         + "\n-------------------------------";
      for (int i = 0; i < markArray.length; i++) {
         report += "\n\n" + markArray[i];
      }
      return report;
   }
   /** Generates the report by name.
   *   @return report
   */
   public String generateReportByName() {
      MarketingCampaign[] byName = Arrays.copyOf(markArray, markArray.length);
      Arrays.sort(byName);
      String report = "";
      report += "-----------------------------------------"
         + "\nMarketing Campaign Report"
         + " (by Name)\n-----------------------------------------";
      for (int i = 0; i < byName.length; i++) {
         report += "\n\n" + byName[i];
      }
      return report;
   }
   /** Generates the report by cost.
   *   @return report
   */
   public String generateReportByCampaignCost() {
      MarketingCampaign[] byCost = Arrays.copyOf(markArray, markArray.length);
      Arrays.sort(byCost, new CampaignCostComparator());
      String report = "";
      report += "-------------------------------------------------"
         + "\nMarketing Campaign Report (by Lowest Campaign Cost)"
         + "\n-------------------------------------------------";
      for (int i = 0; i < byCost.length; i++) {
         report += "\n\n" + byCost[i];
      }
      return report;
   }
   /** Generates the report by ROI.
   *   @return report
   */
   public String generateReportByROI() {
      MarketingCampaign[] byROI = Arrays.copyOf(markArray, markArray.length);
      Arrays.sort(byROI, new ROIComparator());
      String report = "";
      report += "-------------------------------------------------"
         + "\nMarketing Campaign Report"
         + " (by Highest ROI)\n"
         + "-------------------------------------------------";
      for (int i = 0; i < byROI.length; i++) {
         report += "\n\n" + byROI[i];
      }
      return report;
   }
   /** Generates the report of invalids.
   *   @return report
   */
   public String generateInvalidRecordsReport() {
      String result = "----------------------\nInvalid Records Report\n"
         + "----------------------\n";
      for (int i = 0; i < getInvalidRecordsArray().length; i++) {
         result += "\n" + invalids[i] + "\n";
      }
      return result;
   }
}