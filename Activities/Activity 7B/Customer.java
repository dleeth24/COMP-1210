/**
* This class creates a Customer and has various methods that
* change the tetrahedron and access it.
*
* Activity 8
* @author Davis Leeth - COMP 1213
* @version 3/15/21
*/
public class Customer implements Comparable<Customer> {

   private String name;
   private String location;
   private double balance;
   /** This constructor method initializes the given info to its
   *   appropriate variable.
   *   @param nameIn name
   */
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }
   /** Sets location.
   *   @param locationIn location
   */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   /** Changes the balance.
   *   @param amount a
   */
   public void changeBalance(double amount) {
      balance += amount;
   }
   /** Gets the location.
   *   @return location
   */
   public String getLocation() {
      return location;
   }
   /** Gets the balance.
   *   @return balance
   */   
   public double getBalance() {
      return balance;
   }
   /** Sets location.
   *   @param city city
   *   @param state state
   */
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }
   /** toString method.
   *   @return toString
   */
   public String toString() {
      return name + "\n" + location + "\n$" + balance;
   }
   /** Compares two objects.
   *   @param obj object
   *   @return int
   */
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
      }
      else if (this.balance < obj.getBalance()) {
         return -1;
      }
      else {
         return 1;
      }
   }

}