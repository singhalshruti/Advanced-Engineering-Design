/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.FlightDetails.Flight;
import Business.FlightDetails.Route;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Rakesh
 */
public class CustomerBookings {
    private Date Traveldate;
    private Flight flight;
    private String status;
    private float price;
    private int numberOfSeats;
    private String bookedDate;
    private String pnr;
    private int bookingID;
    private static int count=0;
    private String category;
            
    public CustomerBookings() {
        count++;
        bookingID=count;
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        bookedDate = dateFormat.format(new Date());
        
        //this.route=route;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    

    public Date getTraveldate() {
        return Traveldate;
    }

    public void setTraveldate(Date Traveldate) {
        this.Traveldate = Traveldate;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    
    

    public String getBookedDate() {
        return bookedDate;
    }

    public void setBookedDate(String bookedDate) {
        this.bookedDate = bookedDate;
    }

   

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString(){
        return this.getBookedDate();
    }
    
}
