

public class Payment 
{
   private Double amount;
   public Credit theCredit;
   public Cash theCash;
   public WireTransfer theWireTransfer;
   public AliPay theAliPay;
   public WeixinPay theWeixinPay;
   public Order theOrder[];
   
   /**
   @default constructor
    */
   public Payment() 
   {
    
   }
}
