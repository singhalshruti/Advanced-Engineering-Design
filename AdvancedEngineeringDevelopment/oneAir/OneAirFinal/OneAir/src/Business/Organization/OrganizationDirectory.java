/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;


public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization addOrganization(Organization org, String name){
        Organization organization = null;
        if (org instanceof AdminOrganization){
            organization = new AdminOrganization(name);
            organizationList.add(organization);
        }
              
        else if (org instanceof AccountingOrganization){
            organization = new AccountingOrganization(name);
            organizationList.add(organization);
        }
        else if (org instanceof CustomerServiceOrganization){
            organization = new CustomerServiceOrganization(name);
            organizationList.add(organization);
        }
        else if (org instanceof InventoryOrganization){
            organization = new InventoryOrganization(name);
            organizationList.add(organization);
        }
         return organization;
    }
    
    public void deleteOrganization(Organization org){
        organizationList.remove(org);
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        
        return organization;
    }
}