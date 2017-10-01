/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;


import Business.Customer.CustomerDirectory;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;


public class CustomerEnterprise extends Enterprise {

    private CustomerDirectory customerDirectory;


    public CustomerEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Customer);
        customerDirectory = new CustomerDirectory();

    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }


    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public ArrayList<Organization> getSupportedOrganization() {
        return null;
    }
}
