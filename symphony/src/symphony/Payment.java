package symphony;

// TODO For doing this, please consider real industrial situation and improve it. Thank you.
public class Payment {
    private double amountOfPayment;
    private static PayType payType; // TODO generate enum
    private String confirmPayment;

    public enum PayType {
    	Visa,
    	Mastercard,
    	AmericanExpress, 
    	Cash, 
    	Cheque;
    	
    	PayType() { }
    }
    
    public Payment() {	}

    public String payByCredit(PayType cardType){
    	
    	switch (cardType) {
	    	case Visa: confirmPayment = "The total amount due was paid by Visa";
	    	break;
	    	case Mastercard: confirmPayment = "The total amount due was paid by Mastercard";
	    	break;
	    	case AmericanExpress: confirmPayment = "The total amount due was paid by American Express";;
	    	break;
	    	default: confirmPayment = "You did not choose a viable credit option";
	    	break;
    	}
    	
    	return confirmPayment;
    }

    public String payByCash() { return "The total amount due was paid in cash."; }

    public String payByCheque(){ return "The total amount due was paid by cheque."; }

    public double getAmountOfPayment() { return this.amountOfPayment; }

    public void setAmountOfPayment(double amount) { this.amountOfPayment = amount; }

    public PayType getPaymentType() { return Payment.payType; }

    public void setPaymentType(PayType payType) { Payment.payType = payType; }
}
