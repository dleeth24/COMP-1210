import java.text.DecimalFormat;
/**
* This class creates a DirectMC and has various methods that
* change it and access it.
*
* Project 9
* @author Davis Leeth - COMP 1213
* @version 4/1/21
*/
public class DirectMC extends MarketingCampaign {
   private double costPerMailPiece;
   private int numberOfMailPieces;
   /** Base cost. */
   public static final double BASE_COST = 1000;
   /** This constructor method initializes the given info to its
   *   appropriate variable.
   *   @param nameIn name
   *   @param revenueIn rev
   *   @param costPerMailPieceIn cost
   *   @param numberOfMailPiecesIn num
   */
   public DirectMC(String nameIn, double revenueIn, double costPerMailPieceIn,
      int numberOfMailPiecesIn) {
      super(nameIn, revenueIn);
      costPerMailPiece = costPerMailPieceIn;
      numberOfMailPieces = numberOfMailPiecesIn;
   }
   /** Gets the cost per mail piece.
   *   @return costPerMailPiece
   */
   public double getCostPerMailPiece() {
      return costPerMailPiece;
   }
   /** Sets the cost per mail piece.
   *   @param costPerMailPieceIn cost
   */
   public void setCostPerMailPiece(double costPerMailPieceIn) {
      costPerMailPiece = costPerMailPieceIn;
   }
   /** Gets the number of mail pieces.
   *   @return numberOfMailPieces
   */
   public int getNumberOfMailPieces() {
      return numberOfMailPieces;
   }
   /** Sets the number of mail pieces.
   *   @param numberOfMailPiecesIn num
   */
   public void setNumberOfMailPieces(int numberOfMailPiecesIn) {
      numberOfMailPieces = numberOfMailPiecesIn;
   }
   /** Gets campaign cost. 
   *   @return campaign
   */
   public double campaignCost() {
      return BASE_COST + (costPerMailPiece * numberOfMailPieces);
   }
   /** Gets mail cost. 
   *   @return mailCost
   */
   public double mailCost() {
      return costPerMailPiece * numberOfMailPieces;
   }
   /** toString method.
   *   @return toString
   */
   public String toString() {
      DecimalFormat dfM = new DecimalFormat("$#,##0.00");
      return super.toString() + "\n   Base Cost: " + dfM.format(BASE_COST)
         + "\n   Mail Cost: " + dfM.format(mailCost()) + " = " 
         + dfM.format(costPerMailPiece)
         + " per mail piece * " + numberOfMailPieces + " mail pieces";
   }

}