/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.FlightDetails.Flight;

/**
 *
 * @author Rakesh
 */
public class FareRequest extends WorkRequest{
    private Flight flight;

    public FareRequest() {
        flight=new Flight();
        
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    
    
    
}
