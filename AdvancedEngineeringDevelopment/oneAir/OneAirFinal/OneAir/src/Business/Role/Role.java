/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

public abstract class Role {
    
    private String name;
    
    public enum RoleType{
        SystemAdmin("System Admin")
        , EnterpriseAdmin("Enterprise Admin")
        , Admin("Admin")
        ,AccountingManager("Accounting Manager")
        ,AccountingStaff("Accounting Staff")
        ,InventoryManager("Inventory Manager")
        ,InventoryStaff("Inventory Staff")
        ,CustomerService("Customer Service")
        ,Customer("Customer");
        
        private String value;
        private RoleType(String value){
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
    
    public Role(String name) {
        this.name = name;        
    
    }  
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Business business);

    @Override
    public String toString()
    {
        return this.getName();
    }    
    
}