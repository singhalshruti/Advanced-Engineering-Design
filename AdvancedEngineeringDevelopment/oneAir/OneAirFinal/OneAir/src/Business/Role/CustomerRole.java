/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Customer.CustomerWorkAreaJPanel;
import javax.swing.JPanel;

public class CustomerRole extends Role{

    public CustomerRole() {
        super(Role.RoleType.Customer.getValue());
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Business business) {
        return new CustomerWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business);
    }
    
    
}
