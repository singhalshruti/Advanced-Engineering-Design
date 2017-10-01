/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Customer;
import Business.Customer.CustomerBookings;
import Business.Organization.CustomerServiceOrganization;
import Business.Organization.Organization;


public class CustomerServiceRequest extends WorkRequest {

    private String request;
    private Customer customer;
    //private CustomerServiceOrganization customerServiceOrganization;
    //private Organization respondingOrganization;
    private Integer requestId = 0;
    private String requestTitle;
    private CustomerBookings customerbookings;

   public enum CustomerServiceCategory {

        CancelRequest("Cancel Request"),
        PlanTripRequest("Plan Trip Request"),
        OtherRequests("Other Request");
        
        private String value;

        private CustomerServiceCategory(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    
    public String getRequestTitle() {
        return requestTitle;
    }

    public void setRequestTitle(String requestTitle) {
        this.requestTitle = requestTitle;
    }

    

    public CustomerServiceRequest() {
        customer= new Customer();
        customerbookings= new CustomerBookings();
        
    }

    
    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public CustomerBookings getCustomerbookings() {
        return customerbookings;
    }

    public void setCustomerbookings(CustomerBookings customerbookings) {
        this.customerbookings = customerbookings;
    }

   

    

    @Override
    public String toString() {
        return getRequestId().toString();
    }
}
