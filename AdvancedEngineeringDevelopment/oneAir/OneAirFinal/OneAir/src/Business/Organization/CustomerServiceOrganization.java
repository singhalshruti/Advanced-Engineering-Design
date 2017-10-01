/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;


import Business.Role.AdminRole;
import Business.Role.CustomerServiceRole;
import Business.Role.Role;
import java.util.ArrayList;


public class CustomerServiceOrganization extends Organization{
    public CustomerServiceOrganization(String name) {
        super(Organization.Type.CustomerService.getValue(), name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        // The roles required to support the insurance organization is defined here
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminRole()); 
        roles.add(new CustomerServiceRole());
        return roles;
    }
    
    @Override
    public String toString() {
        return super.getName();
    }
}
