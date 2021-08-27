/**
* This class creates a Bank Loan and has various methods that
* change the loan.
*
* Activity 7
* @author Davis Leeth - COMP 1213
* @version 3/8/21
*/
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;
   
   // static variables
   private static int loansCreated = 0;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   
/** This constructor method initializes the given info to its
   *   appropriate variable.
   *   @param customerNameIn name
   *   @param interestRateIn rate
   */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
   /** Tests amount.
   *   @param amount a
   *   @return boolean
   */
   public static boolean isAmountValid(double amount) {
      return amount >= 0;
   }
   /** Tests debt.
   *   @param loan loan
   *   @return boolean
   */
   public static boolean isInDebt(BankLoan loan) {
      return loan.getBalance() > 0;
   }
   /** Gets loans amount.
   *   @return loansCreated loans
   */
   public static int getLoansCreated() {
      return loansCreated;
   }
   /** Resets loans amount.
   *   
   */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }
   /** Borrows from bank.
   *   @param amount a
   *   @return boolean
   */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
   /** Pays bank.
   *   @param amountPaid amount
   *   @return number
   */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   /** Gets balance.
   *   @return balance
   */
   public double getBalance() {
      return balance;
   }
   /** Sets interest rate.
   *   @param interestRateIn rate
   *   @return boolean
   */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   /** Gets interest rate.
   *   @return interestRate
   */
   public double getInterestRate() {
      return interestRate;
   }
   /** Charges interest.
   *   
   */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   /** toString method.
   *   @return toString
   */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }

}
