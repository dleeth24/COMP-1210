/**
* This program contains all of the methods and instance variables that
* make up the information. It also contains the constructor which 
* sets up and initializes the instance variables.
*
* Activity 4
* @author Davis Leeth - COMP 1213
* @version 2/8/21
*/
public class UserInfo {
   // instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;
   // constructor
   /** This constructor method initializes the given info to its
   *   appropriate variable.
   *   @param firstNameIn first name
   *   @param lastNameIn last name
   */
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   // methods
   /** toString method.
   *   @return Return
   */
   public String toString() {
      String output = "Name: " + firstName + " " + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      return output;
   }
   /**
   *   Sets the location.
   *   @param locationIn location
   */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   /**
   *   Sets the age.
   *   @param ageIn age
   *   @return isSet
   */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   /**
   *   Gets the age.
   *   @return age
   */
   public int getAge() {
      return age;
   }
   /**
   *   Gets the location.
   *   @return location
   */
   public String getLocation() 
   {
      return location;
   }
   /**
   *   Logs off.  
   */
   public void logOff() {
      status = OFFLINE;
   }
   /**
   *   Logs on.  
   */
   public void logOn() {
      status = ONLINE;
   }
}