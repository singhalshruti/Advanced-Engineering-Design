/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Rakesh
 */
public class Counter {
    
    public int customerId = 1;
    public int userAccountId = 1;        
    public int bookingId = 1;
    public int organizationId = 1;
    public int workRequestId = 1;
    public int routeId = 1;
    public int flightId =1;
    
    public int getNextFlightId(){
        return flightId++;
    }
    
    public int getNextCutomerId(){
        return customerId++;
    }
    
    public int getNextBookingId(){
        return bookingId++;
    }
    
    public int getNextOrganizationId(){
        return organizationId++;
    }
    
    public int getWorkRequestID(){
        return workRequestId++;
    }    
    
    public int getAccountID(){
        return userAccountId++;
    } 
    
    public int getNextRouteID(){
        return routeId++;
    } 
}
