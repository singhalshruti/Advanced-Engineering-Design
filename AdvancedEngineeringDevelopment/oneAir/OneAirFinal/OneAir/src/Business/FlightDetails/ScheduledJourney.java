/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FlightDetails;

import Business.Customer.Customer;
import java.util.ArrayList;
import java.util.Date;


public class ScheduledJourney extends Route{
    
   
    private Flight flight;
    private ArrayList<Customer>  listOfCustomers;
    private int journeyId;
    private static int count=0;
    private int seatCounter;
    private boolean flag=false;

    public ScheduledJourney() {
        
        flight=new Flight();
        listOfCustomers=new ArrayList<>();
        count++;
        journeyId=count;            
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getSeatCounter() {
        return seatCounter;
    }

    public void setSeatCounter(int seatCounter) {
        this.seatCounter = seatCounter;
    }


    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public ArrayList<Customer> getListOfCustomers() {
        return listOfCustomers;
    }

    public void setListOfCustomers(ArrayList<Customer> listOfCustomers) {
        this.listOfCustomers = listOfCustomers;
    }

    public int getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(int journeyId) {
        this.journeyId = journeyId;
    }
    
    
    
}
