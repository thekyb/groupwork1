package symphony;

import java.util.ArrayList;
import java.util.Date;

public class ConcertCommittee {
	private ConcertSeason concertSeason;	
	private ScheduledConcert scheduledConcert;
	
	public ConcertCommittee() {}
	
	public Concert setConcert(ArrayList<Date> dateList, Venue venue, Conductor conductor, ArrayList<Composition> compositionList, Orchestra orchestra) {
		scheduledConcert = new ConcertBuilder().setDateList(dateList).setVenue(venue).setConductor(conductor)
				                               .setCompositionList(compositionList).setOrchestra(orchestra).build();
		return scheduledConcert;
	}
	
	public void addConcert() {
		concertSeason.addConcert(scheduledConcert);
	}
	

}
