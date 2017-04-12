package symphony;

public class TicketManager {
	private double price;
	private double fees;
	private String seatNumber;
    private Payment payment;
    private Payment.PayType payType;
    
    public TicketManager() {
    	this(10.0, 0.05, "A1");
    }
    
    public TicketManager(double price, double fees, String seatNumber) {
    	this.price = price;
    	this.seatNumber = seatNumber.toUpperCase();
    	this.payment = new Payment();
    	this.fees = fees;
    }

    public boolean issueTicket(Payment.PayType payType) {
    	this.payType = payType;
    	
    	return makePayment();
    }

    public boolean makePayment() {
    	payment.setPaymentType(payType);
    	
    	if (payment.getPaymentType().equals(null)) {
    		return false;
    	}
    	
    	return true;
    }
    
    public String confirmPayment() {
    	String confirmPayment = null;
    	
    	switch(payment.getPaymentType()) {
	    	case Cash: confirmPayment = payment.payByCash();
	    	break;
	    	case Cheque: confirmPayment = payment.payByCheque();
	    	break;
	    	case Visa: 
	    	case Mastercard:
	    	case AmericanExpress: confirmPayment = payment.payByCredit(payment.getPaymentType());
	    	break;
    	}
    	
    	return confirmPayment;
    }

    public String cancelTicket() {
    	return "Your ticket has been cancelled.";
    }

    public String refundPayment() {
    	return "A refund to the value of " + payment.getAmountOfPayment() + " has been made in the form of " + payment.getPaymentType();
    }

    public String printTicket(String venueName) {
    	StringBuilder ticketPrint = new StringBuilder();
    	
    	ticketPrint.append("***********************");
    	ticketPrint.append("\n\n");
    	ticketPrint.append(venueName);
    	ticketPrint.append("\n\n");
    	ticketPrint.append("Seat: " + seatNumber);
    	ticketPrint.append("\n\n");
    	ticketPrint.append("$" + String.format("%1$.2f", calcPrice()));
    	ticketPrint.append("\n\n");
    	ticketPrint.append(confirmPayment());
    	ticketPrint.append("\n\n");
    	ticketPrint.append("***********************"); 	
    	
    	return ticketPrint.toString();
    }

    public boolean checkMembership() {
    	return true;
    }

    public double calcPrice() {
    	payment.setAmountOfPayment(price + (fees * 100));
    	
    	return payment.getAmountOfPayment();
    }

    public Payment getPayment() { return this.payment; }

    public void setPayment(Payment payment) { this.payment = payment; }
}
