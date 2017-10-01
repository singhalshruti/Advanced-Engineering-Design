/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Discounts;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import java.util.ArrayList;

/**
 *
 * @author Rakesh
 */
public class DiscountDirectory {
    private ArrayList<Discounts> listOfDiscounts;
    private CustomerDirectory cd;

    public DiscountDirectory() {
        cd=new CustomerDirectory();
        listOfDiscounts=new ArrayList<>();
    }

    public ArrayList<Discounts> getListOfDiscounts() {
        return listOfDiscounts;
    }

    public void setListOfDiscounts(ArrayList<Discounts> listOfDiscounts) {
        this.listOfDiscounts = listOfDiscounts;
    }
    
    public void setDiscountForCustomer(int i, String s){
        Discounts d=new Discounts();
        for(Customer c: cd.getCustomerList()){
            if (c.getId()==i){
                d.setCustomer(c);
                d.setDiscountCode(s);
                d.setValid(Boolean.TRUE);
            }
        }
    }
    
    
    
    
}
