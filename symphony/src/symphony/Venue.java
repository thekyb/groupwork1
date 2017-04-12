package symphony;

import java.util.ArrayList;
import java.util.Date;

public class Venue {
    private final String            name;
    private final ArrayList<String> seatList;
    private final ArrayList<Date>   timeList;
    private final double            basePrice;
    private final Address           address;
    private TicketManager           ticketManager;

    public Venue() {
    	this(new Venue.VenueBuilder());
    }
    
    private Venue(VenueBuilder builder) {
    	this.name          = builder.name;
    	this.seatList      = builder.seatList;
    	this.timeList      = builder.timeList;
    	this.basePrice     = builder.basePrice;
    	this.address       = builder.address;
    }

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

    public String getName() {
    	return this.name;
    }

    public ArrayList<String> getSeatList() {
    	return this.seatList;
    }
    
    public ArrayList<Date> getTimeList() {
    	return this.timeList;
    }

    public double getBasePrice() {
    	return this.basePrice;
    }

    public Address getAddress() {
    	return this.address;
    }

    public TicketManager getTicketManager() {
    	return this.ticketManager;
    }
    
    public void setTicketManager(TicketManager tm) {
    	this.ticketManager = tm;
    }
    
    public static class VenueBuilder implements Builder<Venue> {
    	private String            name;
        private ArrayList<String> seatList;
        private ArrayList<Date>   timeList;
        private double            basePrice;
        private Address           address;
        
        public VenueBuilder name(String name) {
        	this.name = name;
        	return this;
        }
        
        public VenueBuilder seatList(ArrayList<String> seatList) {
        	this.seatList = seatList;
        	return this;
        }
        
        public VenueBuilder timeList(ArrayList<Date> timeList) {
        	this.timeList = timeList;
        	return this;
        }
        
        public VenueBuilder basePrice(double basePrice) {
        	this.basePrice = basePrice;
        	return this;
        }
        
        public VenueBuilder address(Address address) {
        	this.address = address;
        	return this;
        }
        
    	public Venue build() {
    		return new Venue(this);
    	}
    }
}

