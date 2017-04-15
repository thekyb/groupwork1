package symphony;

import java.util.ArrayList;
import java.util.Date;

public class ConcertBuilder {
    private ScheduledConcert scheduledConcert;
    
    private ArrayList<Date> dateList;
    private Venue venue;
    private Conductor conductor;
    private ArrayList<Composition> compositionList;
    private Orchestra orchestra;
    
    public ConcertBuilder setDateList(ArrayList<Date> dateList) {
    	this.dateList = dateList;
        return this;
    }
    
    public ConcertBuilder setVenue(Venue venue) {
    	this.venue = venue;
    	return this;
    }
    
    public ConcertBuilder setConductor(Conductor conductor) {
    	this.conductor = conductor;
    	return this;
    }
    
    public ConcertBuilder setCompositionList(ArrayList<Composition> compositionList) {
    	this.compositionList = compositionList;
    	return this;
    }    
    
    public ConcertBuilder setOrchestra(Orchestra orchestra) {
    	this.orchestra = orchestra;
    	return this;
    }
    
    public ScheduledConcert build() {
    	return new ScheduledConcert(this);
    }
    
    public ArrayList<Date> getDateList() { return dateList;	}	
	public Venue getVenue() { return venue;	}
	public Conductor getConductor() { return conductor;	}
	public ArrayList<Composition> getCompositionList() { return compositionList; }	
	public Orchestra getOrchestra() { return orchestra;	}
    
}
