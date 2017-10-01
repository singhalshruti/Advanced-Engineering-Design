/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;


import Business.Customer.CustomerDirectory;
import Business.Organization.AccountingOrganization;
import Business.Organization.AdminOrganization;
import Business.Organization.CustomerServiceOrganization;
import Business.Organization.InventoryOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;


public class AirlineEnterprise extends Enterprise {
    private CustomerDirectory customerDirectory;
    private Organization organization;
    
    
    public AirlineEnterprise(String name) {
        super(name, EnterpriseType.Airline);
        customerDirectory=new CustomerDirectory();
        
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public ArrayList<Organization> getSupportedOrganization() {
        ArrayList<Organization> organization = new ArrayList<>();        
        organization.add(new AdminOrganization(Type.Admin.getValue()));
        organization.add(new AccountingOrganization(Type.Accounting.getValue()));
        organization.add(new CustomerServiceOrganization(Type.CustomerService.getValue()));
        organization.add(new InventoryOrganization(Type.Inventory.getValue()));
        return organization;
    }

    
    }
