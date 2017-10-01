/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FlightDetails;

import java.util.ArrayList;

/**
 *
 * @author Rakesh
 */
public class ScheduledJourneyDirectory {
    private ArrayList<ScheduledJourney> listOfJourneys;

    public ScheduledJourneyDirectory() {
        listOfJourneys=new ArrayList<>();
    }

     
    public ArrayList<ScheduledJourney> getListOfJourneys() {
        return listOfJourneys;
    }

    public void setListOfJourneys(ArrayList<ScheduledJourney> listOfJourneys) {
        this.listOfJourneys = listOfJourneys;
    }
    
    public ScheduledJourney searchJourney(int id)
    {
        for (ScheduledJourney sj:listOfJourneys)
            if(sj.getJourneyId()==id)
            {
                return sj;
            }
        return null;
    }
    public ScheduledJourney addJourney(ScheduledJourney sj) {        
        listOfJourneys.add(sj);
        return sj;
    } 
    
}
