import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
/**
* This program is the driver for ConeList.java which contains a main method
* that asks for the file name. After this, a Cone
* object is created and stored from the file and it runs ConeList.java. 
*
* Project 5
* @author Davis Leeth - COMP 1213
* @version 2/18/21
*/

public class ConeListApp {
/**
* Sets the variables by calling methods from Cone.java
* and prints the information.
* @param args Command line arguments – not used.
* @throws IOException exception.
*/
   public static void main(String[] args) throws IOException {
      ArrayList<Cone> myList = new ArrayList<Cone>();
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      System.out.println();
      String label = "";
      double height = 0;
      double radius = 0;
      Scanner scanFile = new Scanner(new File(fileName));
      String coneListName = scanFile.nextLine();
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         height = Double.parseDouble(scanFile.nextLine());
         radius = Double.parseDouble(scanFile.nextLine());
         Cone c = new Cone(label, height, radius);
         myList.add(c);
      }
      scanFile.close();
      ConeList myConeList = new ConeList(coneListName, myList);
      System.out.println(coneListName);
      System.out.println();
      System.out.println(myConeList.toString());
      System.out.println(myConeList.summaryInfo());
   }
}