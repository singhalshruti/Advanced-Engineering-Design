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
public class FlightDirectory {
    private ArrayList<Flight> listOfFlights;

    public FlightDirectory() {
        listOfFlights=new ArrayList<>(); 
    }

    public ArrayList<Flight> getListOfFlights() {
        return listOfFlights;
    }

    public void setListOfFlights(ArrayList<Flight> listOfFlights) {
        this.listOfFlights = listOfFlights;
    }
    
     public Flight searchFlight(int flightId){
        for(Flight f:listOfFlights){
            if(f.getFlightId()==flightId){
              return f;  
            }
    }return null;
     }
     
     public Flight addFlight(Flight f){
         listOfFlights.add(f);
         return f;
     }
     public void removeFlight(Flight f){
        listOfFlights.remove(f);
    }
}
