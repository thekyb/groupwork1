package symphony;

import java.util.Date;
import java.util.ArrayList;

public class ScheduledConcert extends Concert{
    private ArrayList<Date> mDateList;
    private Venue venue;
    private Conductor conductor;
    private ArrayList<Composition> compositionList;
    private Orchestra orchestra;

    public ScheduledConcert(int id, String name, boolean performed){
    	super(id, name, performed);
    }

    public ArrayList<Date> getDateList() {
		return mDateList;
	}
	public void setDateList(ArrayList<Date> dateList) {
		this.mDateList = dateList;
	}
	public Venue getVenue() {
		return venue;
	}
	public void setVenue(Venue venue) {
		this.venue = venue;
	}
	public Conductor getConductor() {
		return conductor;
	}
	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}
	public ArrayList<Composition> getCompositionList() {
		return compositionList;
	}
	public void setCompositionList(ArrayList<Composition> compositionList) {
		this.compositionList = compositionList;
	}
	public Orchestra getOrchestra() {
		return orchestra;
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
