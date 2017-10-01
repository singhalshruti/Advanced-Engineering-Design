/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.EnterpriseAdmin.EnterpriseAdminWorkAreaJPanel;
import javax.swing.JPanel;


public class EnterpriseAdminRole extends Role{
    public EnterpriseAdminRole() {
        super(Role.RoleType.EnterpriseAdmin.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Business business) {
;return new EnterpriseAdminWorkAreaJPanel(userProcessContainer, userAccount, organization, enterprise, business);
    }
}
