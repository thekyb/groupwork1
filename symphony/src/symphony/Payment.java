package symphony;

/**
 * Payment class accepts the various different payments and stores them
 * 
 * @author Stephen Stewart
 * @group  4: Youngbong Ko, Maga Lee, Seok Hwan Lee, Rebecca Dawdy, Stephen Stewart
 */
public class Payment {
    private double amountOfPayment;
    private static PayType payType; // TODO generate enum
    private String confirmPayment;

    /**
     * The types of payments accepted
     */
    public enum PayType {
    	Visa,
    	Mastercard,
    	AmericanExpress, 
    	Cash, 
    	Cheque;
    	
    	PayType() { }
    }
    
    /**
     * Default Constructor
     */
    public Payment() {	}

    /**
     * Allows the user to pay by various different credit cards
     * @param cardType The payment type to be processed
     * @return String
     */
    public String payByCredit(PayType cardType){
    	
    	switch (cardType) {
	    	case Visa: setPaymentType(PayType.Visa);
	    			confirmPayment = "The total amount due was paid by Visa.";
	    			break;
	    	case Mastercard: setPaymentType(PayType.Mastercard);
	    		confirmPayment = "The total amount due was paid by Mastercard.";
	    		break;
	    	case AmericanExpress: setPaymentType(PayType.AmericanExpress);
	    		confirmPayment = "The total amount due was paid by American Express.";;
	    		break;
	    	default: confirmPayment = "You did not choose a viable credit option.";
	    	break;
    	}
    	
    	return confirmPayment;
    }

    /**
     * Allows the user to pay by cash
     * @return String
     */
    public String payByCash() { return "The total amount due was paid in cash."; }

    /**
     * Allows the user to pay by cheque
     * @return String
     */
    public String payByCheque(){ return "The total amount due was paid by cheque."; }

    /**
     * Returns the amount of the payment
     * @return Double
     */
    public double getAmountOfPayment() { return this.amountOfPayment; }

    /**
     * Sets the amount of the payment received
     * @param amount Total amount of the payment to be made
     */
    public void setAmountOfPayment(double amount) { this.amountOfPayment = amount; }

    /**
     * Returns the payment type used
     * @return PayType (Enum)
     */
    public PayType getPaymentType() { return Payment.payType; }

    /**
     * Sets the payment type used
     * @param payType the payment type to be used
     */
    public void setPaymentType(PayType payType) { Payment.payType = payType; }
}
