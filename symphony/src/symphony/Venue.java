package symphony;

import java.util.ArrayList;
import java.util.Date;

/**
 * The venue class, creates the venue and allows for details such as the name and address of the venue, and the addition of seats
 * for the venue layout.
 * 
 * @author Stephen Stewart
 * @group  4: Youngbong Ko, Maga Lee, Seok Hwan Lee, Rebecca Dawdy, Stephen Stewart
 *
 */
public class Venue {
    private String name;
    private ArrayList<String> seatList;
    private ArrayList<Date> timeList;
    private double basePrice;
    private Address address;
    private TicketManager ticketManager;

    /**
     * Default Constructor
     */
    public Venue() { }

    /**
     * Checks the first character of the string seat and compares it against the rows. Rows closer to the stage are more expensive.
     * The initial price is set with the basePrice member.
     * @param seat A string with the seat row and number
     * @return Double
     */
    public double calcPricebySeat(String seat) {
    	
    		String seatRow = seat.substring(0,1).toUpperCase();
    		double returnPrice = 0;
    		
    		switch (seatRow) {
    		case "A": case "B": case "C":
    		case "D": returnPrice = basePrice * (0.25 * 100);
    		break;
    		
    		case "E": case "F": case "G": case "H":
    		case "I": returnPrice = basePrice * (0.2 * 100);
    		break;
    		
    		case "J": case "K": case "L": case "M":
    		case "N": returnPrice = basePrice * (0.09 * 100);
    		break;
    		
    		case "O": case "P": case "Q": case "R":
    		case "S": case "T": case "U":
    		case "V": returnPrice = basePrice * (0.08 * 100);
    		break;
    		
    		case "W": case "X": case "Y":
    		case "Z": returnPrice = basePrice * (0.05 * 100);
    		break;
    		}
    		
    		return returnPrice;
    }
    
	/**
	 * Gets the name of the venue
	 * @return String
	 */
    public String getName() {
    	return this.name;
    }
    
    /**
     * Sets the name of the venue
     * @param name Venue name
     */
    public void setName(String name) {
    	this.name = name;
    }

    /**
     * Returns the seat list
     * @return ArrayList<String>
     */
    public ArrayList<String> getSeatList() {
    	return this.seatList;
    }
    
    /**
     * Sets the seat list with an ArrayList as the parameter
     * @param seatList Holds the list of seats
     */
    public void setSeatList(ArrayList<String> seatList) {
    	this.seatList = seatList;
    }
    
    /**
     * Returns the date list
     * @return ArrayList<Date>
     */
    public ArrayList<Date> getTimeList() {
    	return this.timeList;
    }
    
    /**
     * Sets the time list with an ArrayList as the parameter
     * @param timeList Holds the list of dates
     */
    public void setTimeList(ArrayList<Date> timeList) {
    	this.timeList = timeList;
    }

    /**
     * Returns the double base price
     * @return Double
     */
    public double getBasePrice() {
    	return this.basePrice;
    }
    
    /**
     * Sets the base price to be used for pricing seats in the venue
     * @param basePrice The price to be set 
     */
    public void setBasePrice(double basePrice) {
    	this.basePrice = basePrice;
    }

    /**
     * Returns the address of the venue
     * @return Address
     */
    public Address getAddress() {
    	return this.address;
    }
    
    /**
     * Sets the address of the venue
     * @param address The address of the venue to be set
     */
    public void setAddress(Address address) {
    	this.address = address;
    }

    /**
     * Returns the TicketManager associated with the instiantiated object
     * @return TicketManager
     */
    public TicketManager getTicketManager() {
    	return this.ticketManager;
    }
    
    /**
     * Sets the TicketManager to be associated with the instiantiated object
     * @param tm The TicketManager object to be used
     */
    public void setTicketManager(TicketManager tm) {
    	this.ticketManager = tm;
    }
    
}

