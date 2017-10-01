/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.CustomerService.CustomerServiceWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class CustomerServiceRole extends Role {

    public CustomerServiceRole() {
        super(Role.RoleType.CustomerService.getValue());
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Business business) {
        return new CustomerServiceWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business);
    }
    
}
