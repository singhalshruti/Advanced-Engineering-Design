/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Discounts;

import Business.Customer.Customer;


/**
 *
 * @author Rakesh
 */
public class Discounts {
    private String discountCode;
    private Customer customer;
    private Boolean valid;

    public Discounts() {
        this.valid = false;
        customer=new Customer();
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }
    
    
    
}
