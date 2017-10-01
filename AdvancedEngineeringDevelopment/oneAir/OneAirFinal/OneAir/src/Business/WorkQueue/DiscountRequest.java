/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Customer;
import Business.Discounts.DiscountDirectory;
import Business.Discounts.Discounts;
import Business.FlightDetails.Flight;

/**
 *
 * @author Rakesh
 */
public class DiscountRequest extends WorkRequest{
    private DiscountDirectory dr;
    private Flight flight;
    private String discountCode;


    public DiscountDirectory getDr() {
        
        dr= new DiscountDirectory();
        flight=new Flight();
        return dr;
    }

    public void setDr(DiscountDirectory dr) {
        this.dr = dr;
    }

  
    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }
    
    private boolean authenticateDiscount(Customer c,String s){
        for(Discounts d:dr.getListOfDiscounts()){
            if(d.getCustomer().equals(c)){
                if(s.equals(d.getDiscountCode())){
                    return true;
                }
            }}
            return false; 
    }

    @Override
    public String toString() {
        return super.getRequestType(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
