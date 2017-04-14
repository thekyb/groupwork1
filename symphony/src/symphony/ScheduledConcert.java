package symphony;

import java.util.Date;
import java.util.ArrayList;

public class ScheduledConcert extends Concert{
    private ArrayList<Date> dateList;
    private Venue venue;
    private Conductor conductor;
    private ArrayList<Composition> compositionList;
    private Orchestra orchestra;

    public ScheduledConcert(int id, String name, boolean performed){
    	super(id, name, performed);
    }
    
    public ScheduledConcert(ConcertBuilder concertBuilder) {
    	this.dateList = concertBuilder.getDateList();
    	this.venue = concertBuilder.getVenue();
    	this.conductor = concertBuilder.getConductor();
    	this.compositionList = concertBuilder.getCompositionList(); 
    	this.orchestra = concertBuilder.getOrchestra();    
    }

    public ArrayList<Date> getDateList() { return dateList;	}	
	public Venue getVenue() { return venue;	}
	public Conductor getConductor() { return conductor;	}
	public ArrayList<Composition> getCompositionList() { return compositionList; }	
	public Orchestra getOrchestra() { return orchestra;	}
	
	public void setDateList(ArrayList<Date> dateList) {
		this.dateList = dateList;
	}
	
	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	public void setCompositionList(ArrayList<Composition> compositionList) {
		this.compositionList = compositionList;
	}

	public void setOrchestra(Orchestra orchestra) {
		this.orchestra = orchestra;
	}

	
	public void addComposition(){

    }

    public void getComposition(){

    }

    public void removeComposition(){

    }
    
}
