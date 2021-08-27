/**
* This program is the driver for UserInfo.java which contains methods
* for setting and getting, location, age, first and last name, and
* whether the user is logged in or not.
*
* Activity 4
* @author Davis Leeth - COMP 1213
* @version 2/8/21
*/

public class UserInfoDriver {
/**
* Sets the variables by calling methods from UserInfo.java
* and prints the information.
* @param args Command line arguments – not used.
*/
   public static void main(String[] args) {
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
   
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   }
}