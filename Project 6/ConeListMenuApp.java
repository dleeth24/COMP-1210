import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
/**
* This program is the driver for ConeListApp. It is the interaction
* menu for Cones.
*
* Project 6
* @author Davis Leeth - COMP 1213
* @version 2/24/21
*/
public class ConeListMenuApp {
/**
* Sets the variables by calling methods from Cone.java
* and prints the information.
* @param args Command line arguments – not used.
* @throws IOException exception
*/
   public static void main(String[] args) throws IOException {
      String listName = "no list name";
      ArrayList<Cone> thatCone = new ArrayList<Cone>();
      ConeList list = new ConeList(listName, thatCone);
      String fileName = "no file name";
     
      Scanner scan = new Scanner(System.in);
      System.out.print("Cone List System Menu\nR - Read File and "
         + "Create Cone List\nP - Print Cone List\nS - Print "
         + "Summary\nA - Add Cone\nD - Delete Cone\nF - Find "
         + "Cone\nE - Edit Cone\nQ - Quit\n");
      char choice = 'Q';
      do {
         System.out.print("Enter Code [R, P, S, A,"
            + " D, F, E, or Q]: ");
         choice = scan.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'R':
               System.out.print("\tFile name: ");
               fileName = scan.nextLine();
               list = list.readFile(fileName);
               System.out.println("\tFile read in and Cone List "
                  + "created\n");
               break;
               
            case 'P':
               System.out.println(list);
               break;
               
            case 'S':
               System.out.println("\n" + list.summaryInfo() + "\n");
               break;
               
            case 'A':
               String labelIn = "";
               double heightIn = 0;
               double radiusIn = 0;
               System.out.print("\tLabel: ");
               labelIn = scan.nextLine();
               System.out.print("\tHeight: ");
               heightIn = Double.parseDouble(scan.nextLine()); 
               System.out.print("\tRadius: ");
               radiusIn = Double.parseDouble(scan.nextLine());
               list.addCone(labelIn, heightIn, radiusIn);
               System.out.println("\t*** Cone added ***\n");
               break;
              
            case 'D':
               System.out.print("\tLabel: ");
               String labelIn2 = scan.nextLine();
               if (list.findCone(labelIn2) == null) {
                  System.out.println("\t\"" + labelIn2 + "\""
                     + " not found\n");
               }
               else {
                  int i = thatCone.indexOf(labelIn2);
                  System.out.println("\t\"" + list.findCone(labelIn2).getLabel()
                      + "\" deleted\n");
                  list.deleteCone(labelIn2);
               }
               break;
               
            case 'F':
               System.out.print("\tLabel: ");
               String labelIn3 = scan.nextLine();
               if (list.findCone(labelIn3) == null) {
                  System.out.println("\t\"" + labelIn3 + "\""
                     + " not found\n");
               }
               else {
                  System.out.println(list.findCone(labelIn3) + "\n");
               }
               break;
               
            case 'E':
               System.out.print("\tLabel: ");
               String labelIn4 = scan.nextLine();
               System.out.print("\tHeight: ");
               double heightIn2 = Double.parseDouble(scan.nextLine()); 
               System.out.print("\tRadius: ");
               double radiusIn2 = Double.parseDouble(scan.nextLine());
               if (list.findCone(labelIn4) == null) {
                  System.out.println("\t\"" + labelIn4 + "\""
                     + " not found\n");
               }
               else {
                  list.editCone(labelIn4, heightIn2, radiusIn2);
                  System.out.println("\t\"" + labelIn4 + "\""
                     + " successfully edited\n");
               }
               break;
               
            case 'Q':
               break;
               
            default:
               System.out.println("\t*** invalid code ***\n");
         }
          
      } while (choice != 'Q');
      
   }
}
