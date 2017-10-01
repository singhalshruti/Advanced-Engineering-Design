/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FlightDetails;

import Business.Customer.Customer;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rakesh
 */
public class Flight extends Route{
    private int flightId;
    private Boolean flag=true;
    private int totalEconomySeat;
    private int totalBusinessSeat;
    private Date date;
    private float economyPrice;
    private float BusinessPrice;
    private RouteDirectory routeDirectory;
    private ArrayList<Customer>  listOfCustomers;
    private int economyCounter;
    private int businessCounter;

    public int getEconomyCounter() {
        return economyCounter;
    }

    public void setEconomyCounter(int economyCounter) {
        this.economyCounter = economyCounter;
    }

    public int getBusinessCounter() {
        return businessCounter;
    }

    public void setBusinessCounter(int businessCounter) {
        this.businessCounter = businessCounter;
    }

    
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<Customer> getListOfCustomers() {
        return listOfCustomers;
    }

    public void setListOfCustomers(ArrayList<Customer> listOfCustomers) {
        this.listOfCustomers = listOfCustomers;
    }
    

    public Flight() {
        routeDirectory=new RouteDirectory();
        listOfCustomers = new ArrayList<>();
    }

    public RouteDirectory getRouteDirectory() {
        return routeDirectory;
    }

    public void setRouteDirectory(RouteDirectory routeDirectory) {
        this.routeDirectory = routeDirectory;
    }

    public int getTotalEconomySeat() {
        return totalEconomySeat;
    }

    public void setTotalEconomySeat(int totalEconomySeat) {
        this.totalEconomySeat = totalEconomySeat;
    }

    public int getTotalBusinessSeat() {
        return totalBusinessSeat;
    }

    public void setTotalBusinessSeat(int totalBusinessSeat) {
        this.totalBusinessSeat = totalBusinessSeat;
    }

    public float getEconomyPrice() {
        return economyPrice;
    }

    public void setEconomyPrice(float economyPrice) {
        this.economyPrice = economyPrice;
    }

    public float getBusinessPrice() {
        return BusinessPrice;
    }

    public void setBusinessPrice(float BusinessPrice) {
        this.BusinessPrice = BusinessPrice;
    }
    

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return String.valueOf(flightId); //To change body of generated methods, choose Tools | Templates.
    }

    

   
  
}
