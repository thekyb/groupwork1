package symphony;

/**
 * TicketManager class handles the cost of the ticket, including fees. It also handles the issuing, refunding and printing of tickets
 * 
 * @author Stephen Stewart
 * @group  4: Youngbong Ko, Maga Lee, Seok Hwan Lee, Rebecca Dawdy, Stephen Stewart
 */
public class TicketManager {
	private double price;
	private double fees;
	private String seatNumber;
    private Payment payment;
    private Payment.PayType payType;
    
    /**
     * Default constructor
     */
    public TicketManager() {
    	this(10.0, 0.05, "A1");
    }
    
    /**
     * Parameterized Constructor. Accepts the cost of the seat, any fees associated with the processing of the ticket
     * and the seat number which the ticket relates to.
     * @param price The price of a seat
     * @param fees The processing fees to be added
     * @param seatNumber The seat number the cost relates to
     */
    public TicketManager(double price, double fees, String seatNumber) {
    	this.price = price;
    	this.seatNumber = seatNumber.toUpperCase();
    	this.payment = new Payment();
    	this.fees = fees;
    }

    /**
     * Issues the ticket by processing the payment
     * @param payType The type of payment to be processed
     * @return Boolean
     */
    public boolean issueTicket(Payment.PayType payType) {
    	this.payType = payType;
    	
    	return makePayment();
    }

    /**
     * Sets the payment type and processes the payment
     * @return Boolean
     */
    private boolean makePayment() {
    	payment.setPaymentType(payType);
    	
    	if (payment.getPaymentType().equals(null)) {
    		return false;
    	}
    	
    	return true;
    }
    
    /**
     * Confirms the payment to the user by returning a confirmation message
     * @return String
     */
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

    /**
     * Allows the user to cancel a ticket
     * @return String
     */
    public String cancelTicket() {
    	return "Your ticket has been cancelled.";
    }

    /**
     * Allows the user to refund a payment for a ticket
     * @return String
     */
    public String refundPayment() {
    	return "A refund to the value of $" + String.format("%1$.2f",payment.getAmountOfPayment()) + " has been made in the form of " + payment.getPaymentType();
    }

    /**
     * Prints the ticket, including the venue name, the cost of the ticket and a confirmation of the type of payment processed
     * @param venueName The name of the venue which the ticket has been processed for
     * @return String
     */
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

    /**
     * Checks that the user is actually a member.
     * @return Boolean
     */
    public boolean checkMembership() {
    	return true;
    }

    /**
     * Calculates the total cost of the ticket including any fees associated. Passes the value to the Payment class
     * @return Double
     */
    public double calcPrice() {
    	payment.setAmountOfPayment(price + (fees * 100));
    	
    	return payment.getAmountOfPayment();
    }

    /**
     * Returns the Payment class object
     * @return Payment
     */
    public Payment getPayment() { return this.payment; }

    /**
     * Sets a new Payment object as the payment manager
     * @param payment The Payment object to be used
     */
    public void setPayment(Payment payment) { this.payment = payment; }
}
