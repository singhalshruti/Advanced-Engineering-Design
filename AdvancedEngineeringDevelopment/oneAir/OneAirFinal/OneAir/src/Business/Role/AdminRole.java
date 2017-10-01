/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.OrganizationAdmin.AdminWorkAreaJPanel;
import javax.swing.JPanel;


public class AdminRole extends Role{

    public AdminRole() {
        super(Role.RoleType.Admin.getValue());
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Business business) {
        return new AdminWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business);
    }

    
    
}
